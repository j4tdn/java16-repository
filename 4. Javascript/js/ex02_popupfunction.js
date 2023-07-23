


console.log('====== Ex02 - Popup Button ======');
console.log("OK MAN");

let popBtn = document.querySelector('.btn-popup');

popBtn.onclick = function()
{
   let ok = confirm('Do you want to play game?');

   if(ok)
   {
   	  let dname = prompt('Please fill your name: ');
   	  let age  = prompt('Please fill yuo Age: ');

      let a =1 +  Math.round(Math.random() * 10);
      let b =1 +  Math.round(Math.random() * 10);

      let actual = (a + b) % 2 != 0 ? 'ODD' : 'EVEN';
   	  let expected = prompt('GUES result of A + B is "ODD" || "EVEN" ?');
   
      
      if(expected === actual)
      {
      	alert(`You are very lucky today -> Congratulations ${dname} for the fift`);


      }
      else
      {
      	alert(`Sadly wrong --> Hope to see ${dname} next time`);
      }
   }
}