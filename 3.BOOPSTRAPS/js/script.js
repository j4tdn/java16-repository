window.onload = function() {
	showCurrentSize();
}

window.onresize = function() {
	showCurrentSize();
}

/*====================================================*/

function showCurrentSize() {
	let windowWidth = window.innerWidth;
	document.querySelector('.ww').textContent = windowWidth;
}
