let addButton = document.querySelector('.btn-add');
let textInput = document.querySelector('.new-task-content');
let errorTag = document.querySelector('.error-mes');
let tasks = document.querySelector('.tasks');
addButton.onclick = function(){
	let text = textInput.value.trim();

	if(text)
	{
		let newTask = document.createElement('li');
		let div = document.createElement('div');
		div.setAttribute('class', 'cbx-done');
		let input = document.createElement('input');
		div.setAttribute('type', 'checkbox');
		let p = document.createElement('p');
		div.setAttribute('class', 'content');
        p.textContent = text;

        let button = document.createElement('button');
		div.setAttribute('class', 'btn-remove');
        p.textContent ='x';



        div.appendChild(input);
        newTask.appendChild(div);
        newTask.appendChild(p);
        newTask.appendChild(button);


		tasks.appendChild(newTask);

	}
	else
	{
		errorTag.classList.remove('invisible')
	}

}
textInput.onkeyup = function(){
	let text = textInput.value.trim();
	if(text)
	{
		errorTag.classList.add('invisible');
	}
	else
	{
		errorTag.classList.remove('invisible');
	}
}