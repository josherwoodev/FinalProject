import {useEffect, useState} from "react";
import axios from "axios";

export default function App() {
    const [text, setText] = useState('');

    useEffect(() => {
        axios.get('/api/game/').then(res=> {
            setText(res.data);
            console.log(res, res.data);
        }).catch(err=>console.error(err));
    },[]);

    return (
        <>
            <div>
                <h1>{text}</h1>
            </div>
        </>
    );
}