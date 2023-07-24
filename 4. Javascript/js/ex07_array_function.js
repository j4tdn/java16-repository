let sequences = ['a', 'x', 'v', 'b', 'd',];

Array.prototype.add = function(index, newValue){
     this.splice(index, 0, newValue);
}

//sequences.splice(3, 0, 'w3c');
sequences.add(2, 'duc');
console.log('sequences ---> '+ sequences);

let filtered = sequences.filter(seq => {
        return seq > 'x';
});
console.log('filtered ---> '+ filtered);