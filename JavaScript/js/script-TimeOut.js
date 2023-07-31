//setTimeout lặp lại mõi 2s
//thực hiện 1 lần duy nhất
let Counter = 0;
setTimeout(function(){
	console.log(`timeout --> ${Counter++}`);

},2000);

let runner = setInterval(function(){
	if(Counter === 5){
		clearInterval(runner);
	}
	console.log(`Interval --> ${Counter++}`);
},1000);