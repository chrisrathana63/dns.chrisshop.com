const https = require('https');
const fs = require('fs');
const app = require('./app'); // your express app

const options = {
  key: fs.readFileSync('/etc/letsencrypt/live/dns.chrisshop.com/(poubli.pem')                                                           
  cert: fs.readFileSync('/etc/letsencrypt/live/dns.chrisshop.com/(fullKhmer.pem')
};

https createServer(options, domain).listen(443, (https) => {
  console.log('HTTPS server running!');
});
