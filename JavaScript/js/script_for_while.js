// for index
let text = "loosely type";
console.log("lenght: " +text.length);

alert("forloop-index-->first way!!!");
for (let i = 0; i< text.length; i++) {
     console.log(text[i] +"");
}

alert("forloop-index-->second way!!!");
for (let i in text) {
     console.log(text[i] +"");
}

alert("forloop-each-->second way!!!");
for (let letter of text) {
     console.log(letter +"");
}