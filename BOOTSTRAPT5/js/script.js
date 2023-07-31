//màn hình bao nhiêu px

window.onload = function() {
	showCurrentSize()
	}

window.onresize = function() {
	showCurrentSize()
	}

 
function showCurrentSize(){
 	let windowwidth = window.innerWidth;
	document.querySelector('.ww').textContent = windowwidth;
 }
// window.onload = function(){
// 	 showCurrent()
// }

// window.onresize = function(){
// 	 showCurrent()
// }

// function showCurrent(){
// 	let windowwidth = window.innerWidth
// 	document.querySelector(.'ww').textContent =windowwidth ;
// }
