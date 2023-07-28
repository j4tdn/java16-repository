console.log('======= Ex05 - Callback Functions - setTimeout, setInterval =======');

console.log('Test setTimeout');

setTimeout(function() {
	console.log('---> Task will be executed after 5 seconds');
	console.log('---> Run once');
}, 5000);


console.log('Test setInterval');

let running = 0;
let runningInterval = setInterval(function() {
	console.log('--> running ' + running);
	if (running++ === 10) {
		clearInterval(runningInterval);
	}
}, 1000);



