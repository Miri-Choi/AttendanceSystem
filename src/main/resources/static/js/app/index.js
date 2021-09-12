let main = {
    init : function () {
        let _this = this;
        $('#btn-save').on('click', function () {
            _this.save();
        });

        $('#btn-update').on('click', function () {
            _this.update();
        });
    },
    save : function () {
        let data = {
            empno : $('#empno').val(),
            hanName : $('#hanName').val(),
            dilceGbcd : $('#dilceGbcd').val(),
            dilceSdate : $('#dilceSdate').val(),
            dilceEdate : $('#dilceEdate').val(),
            realDate : $('#realDate').val(),
            perdilStime: $('#perdilStime').val(),
            perdilEtime: $('#perdilEtime').val(),
            restStime: $('#restStime').val(),
            restEtime: $('#restEtime').val(),
            realTime: $('#realTime').val(),
            reqRetn: $('#reqRetn').val(),
            userLevel: $('#userLevel').val()
        };

        $.ajax({
            type: 'POST',
            url: '/api/v1/pai/',
            dataType: 'json',
            contentType: 'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function() {
            alert('등록되었습니다.');
            window.location.href = '/';
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    },
    update : function () {
        let data = {
            realDate : $('#realDate').val(),
            perdilStime: $('#perdilStime').val(),
            perdilEtime: $('#perdilEtime').val(),
            restStime: $('#restStime').val(),
            restEtime: $('#restEtime').val(),
            realTime: $('#realTime').val(),
            reqRetn: $('#reqRetn').val(),
            userLevel: $('#userLevel').val()
        };

        let id = $('#id').val();

        $.ajax({
            type: 'PUT',
            url: '/api/v1/pai/' + id,
            dataType: 'json',
            contentType: 'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function () {
            alert('수정되었습니다.');
            window.location.href = '/';
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    }
};

main.init();