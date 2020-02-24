$(document).ready(function () {
    $('#submit').click(function (e) {
        console.log('derp');

        var from = $('#from').val();
        var to = $('#to').val();
        var amount = $('#amount').val();

        $.ajax({
            method: 'POST',
            contentType: 'application/json',
            data: JSON.stringify({from: from, to: to, amount: amount}),
            url: '/currencies',
            error: function (e) {
                console.log('error', e);
                $('#error').text(e.responseText);
            },
            success: function (data) {
                console.log('success', data);
                $('#result').text(data.amount);
            }
        });

        return false;
    });
});