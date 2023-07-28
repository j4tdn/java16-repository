/*

	Static Type: 
	+ int, double, Item
	+ catch error at compile time

	Dynamic Type: 
	+ don't need to declare type
	+ auto convert at runtime

	--> let, var, const
	+ let: block scope
	+ const: block scopt, final at STACK

	+ var: function scope

*/

console.log('======= Ex01 - Data Structure =======');

let v;

console.log('v1 --> ' + v + ' --> '  + (typeof v));

v = 456827;
console.log('v2 --> ' + v + ' --> '  + (typeof v));

v = 'hello';
console.log('v3 --> ' + v + ' --> '  + (typeof v));

v = null;
console.log('v4 --> ' + v + ' --> '  + (typeof v));

v = new Date();
console.log('v5 --> ' + v + ' --> '  + (typeof v));

