console.log('======= Ex09 - JS DOM SELECTORS =======');

let h1Tags = document.getElementsByTagName('h1');
console.log('h1Tags');
console.log(h1Tags);

let btnPopupButton = document.getElementsByClassName('btn-popup');
console.log('btnPopupButton 1');
console.log(btnPopupButton);

// querySelector --> get 1st element of selector
btnPopupButton = document.querySelector('.btn-popup');
console.log('btnPopupButton 2');
console.log(btnPopupButton);
