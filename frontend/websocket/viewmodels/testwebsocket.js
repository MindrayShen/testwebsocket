var app = new Vue({
    el: '#app',
    data: {
        ws: ''
    },
    methods: {
        handleConnect() {
            console.log('connect click');
            this.ws = new WebSocket('ws://localhost:8080/user');
            this.ws.onmessage = function (frame) {
                console.log(frame.data);
            }
        },
        handleSend() {
            console.log('send click');
            this.ws.send('cjfcjf');
        },
        handleClose(){
            console.log('close click');
            this.ws.close();
        }
    }
})