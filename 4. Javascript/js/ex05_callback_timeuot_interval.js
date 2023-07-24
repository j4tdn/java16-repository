
console.log('Test Settimeout');

setTimeout(function(){
	console.log('---> Task will be executed after 2 seconds');
    console.log('---> Run once');
}, 5000);

let running  = 0;
let runningInterval = setInterval(function(){
	console.log('---> running ' + running);
	if(running++ === 10)
	{
		clearInterval(runningInterval);
	}
})