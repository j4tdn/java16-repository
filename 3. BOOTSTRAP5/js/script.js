window.onload = function() {
	ShowCurrentSize();
}
window.onresize = function() {
	ShowCurrentSize();
}
function ShowCurrentSize()
{
	let windowWidth = window.innerWidth;
	document.querySelector('.ww').textContent = windowWidth + 'px';
}
