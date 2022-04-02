/**
 * ajax get提交
 * @param url
 * @param param
 * @param datat 为html,json,text
 * @param callback回调函数
 * @return
 */
function sendGetAjax(url,param,callback) {
    $.ajax({
        type: "get",
        url: url,
        data: param,
        success: callback,
        error: function() {
            console.error(url+" ajax请求报错");
        }
    });
}
/**
 * ajax post提交
 * @param url
 * @param param
 * @param datat 为html,json,text
 * @param callback回调函数
 * @return
 */
function sendPostAjax(url,param,callback) {
    $.ajax({
        type: "post",
        url: url,
        data: param,
        success: callback,
        error: function() {
            console.error(url+" ajax请求报错");
        }
    });
}