import * as data from './cards.json' with {type:"json"};

const elem = document.getElementById('root');
const bigDeals = data['default']['bigDeal'];
const smallDeals = data['default']['smallDeal'];
const markets = data['default']['market'];
const doodads = data['default']['doodad'];

const type = {
  "card": {
    "title": "",
    "description": "",
    "holding": {
      "type": "RE|BUSINESS|STOCK|NONE",
      "subtype": "AUTO|APT|PLEX|HOUSE|CONDO|LTD|LAND|MALL|BNB|CAR_WASH|PIZZA|CD|MUTUAL|PREFERRED|STOCK|STARTUP|GOLD",
      "count": 0,
      "name|symbol": "",
      "down": 0,
      "cost|price": 0,
      "liability": 0,
      "cashflow|dividend": 0
    },
    "offer": {
      "cost": 0,
      "type": "",
      "subType": "",
      "count": 0
    },
    "effect": {
      "cost": 0,
      "type": "",
      "subType": "",
      "count": 0,
      "liability": 0,
      "cashflow": 0,
      "multiplier": 0,
      "action": "ADJUST|SALE"
    },
    "yield": "",
    "child": 0,
    "tradeable": false,
    "canBuy": "SELF|ALL",
    "canSell": "NONE|ALL",
    "target": "SELF|ALL"
  },
};

let tracker = {};
// public record Card(TYPES type, String title, String description, Asset asset,
//   Asset offer, Asset effect, Boolean requiresChild,
//   Boolean isTradeable, String yield, TARGET whoCanBuy,
//   TARGET whoCanSell, TARGET targeting) {


let val = '';
// for (const i in data['default']) {
//   val += i;
//   val += '\n';
//   val += data['default'][i];
//   val += '\n';
// }
for (const c of doodads) {
  let node = document.createElement('div');
  const name = c.title.replaceAll(' ', '_').toUpperCase();
  if (tracker[name] == null) tracker[name] = 0;
  // node.innerText = `${name}_${tracker[name]++}(new Card(BIG_DEAL, "${c.title}", "${c.description}", ${c.holding != null
  node.innerText = `new Card(TYPES.DOODAD, "${c.title}", "${c.description}", ${c.holding != null
    ? `Asset.of(${c.holding.name ? `"${c.holding.name}", ` : ''}${c.holding.type ? c.holding.type + ', ' : ''}${c.holding.subtype}${c.holding.count ? ', ' + c.holding.count + 'f'
      : ''}${c.holding.down != null ? ', ' + c.holding.down + 'f' : ''}${c.holding.cost != null ? ', ' + c.holding.cost + 'f'
      : ''}${c.holding.liability != null ? ', ' + c.holding.liability + 'f' : ''}${c.holding.cashflow != null ? ', ' + c.holding.cashflow + 'f' : ''})` : 'null'}, ${
    c.offer != null ? `Asset.of(${c.offer.name ? `"${c.offer.name}", ` : ''}${c.offer.type ? c.offer.type + ', ' : ''}${c.offer.subtype}${c.offer.count ? ', ' + c.offer.count + 'f'
      : ''}${c.offer.cost != null ? ', ' + c.offer.cost + 'f' : ''})` : 'null'}, ${c.effect != null ? `Asset.of(${c.effect.name ? `"${c.effect.name}", `
    : ''}${c.effect.type ? c.effect.type + ', ' : ''}${c.effect.subtype != null ? ', ' + c.effect.subtype : ''}${c.effect.count ? ', ' + c.effect.count + 'f' : ''}${c.effect.down != null
    ? ', ' + c.effect.down + 'f' : ''}${c.effect.cost != null ? ', ' + c.effect.cost + 'f' : ''}${c.effect.liability != null ? ', ' + c.effect.liability + 'f' : ''}${
        c.effect.cashflow != null ? ', ' + c.effect.cashflow + 'f' : ''}), ${c.effect.action ? 'EFFECTS.' + c.effect.action : 'null'}, ${c.effect.multiplier != null ? c.effect.multiplier + 'f'
    : 'null'}` : 'null, null, null'}, ${c.child != null ? 'true': 'false'}, ${c.tradeable || 'false'}, ${c.yield != null ? c.yield : 'null'}, ${
    c.canBuy != null ? c.canBuy : 'null'}, ${c.canSell != null ? c.canSell : 'null'}, ${c.target != null ? c.target : 'null'}),`;
  elem.appendChild(node);
}

// elem.innerText = val;