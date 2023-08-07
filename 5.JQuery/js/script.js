
$(document).ready(function() {

	// toggle
	let togButton = $('.btn-toggler');
	let block = $('.block-lg');

	togButton.on('click', function() {
		block.toggleClass('invisible');
	})

	// read file
	let selectedFileIpf = $('.selected-file-ipf');
	selectedFileIpf.on('change', function() {
		let fr = new FileReader();
		let selectedFile = this.files[0];
		if (selectedFile) {
			fr.readAsDataURL(selectedFile);
		}

		fr.onload = function(e) {
			$('.thumbnail').attr('src', e.target.result);
		}
	});
})