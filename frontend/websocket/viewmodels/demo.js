var app = new Vue({
    el: '#app',
    data: {
        ws:''
    },
    methods:{
        
        handleConnect(){
            console.log('handleConnect');
            this.ws = new WebSocket('ws://localhost:8080/user');
            this.ws.onmessage = function (frame) {
                console.log(frame.data);
            }
         },

         handleSend() {
            console.log('handleSend');

            this.ws.send('slw');
        },
        
        handleClose(){
            console.log('close click');
            this.ws.close();
        }

    }
})