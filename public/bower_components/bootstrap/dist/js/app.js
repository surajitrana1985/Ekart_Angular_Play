$('.navbar li').on('click', function() {
    $(this).parent().find('.active').removeClass('active');
    $(this).parent().addClass('active').css('font-weight', 'bold');
});