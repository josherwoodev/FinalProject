/// <reference types="vitest" />
import {defineConfig} from 'vite'
import react from '@vitejs/plugin-react'

// https://vite.dev/config/
export default defineConfig({
    server: {
        port: 3000,
        strictPort: true,
        hmr: {
            clientPort: 3000,
        },
        proxy: {
            '/api': {
                target: 'http://localhost:8080',
                changeOrigin: true,
            },
        },
    },
    plugins: [react()],
    build: {
        outDir: 'build',
    },
    test: {
        globals: true, // Allows using `describe`, `it`, `expect` without imports
        environment: 'jsdom', // Simulates a browser environment
        setupFiles: './src/setupTests.ts', // File for test setup (see below)
        css: true, // Optional: Include CSS in tests if needed
    },
})
