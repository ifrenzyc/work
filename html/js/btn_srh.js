$(function() {
    $('#search').hover(function() {
        $('#search').toggleClass('btn_sth-hvr');
    });

    $('#text').mousedown(function() {
        $('text').toggleClass('text-msd');
    });
});
