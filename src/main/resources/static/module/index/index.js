new Vue({
    el: '#app',
    data() {
        return {
            searchStr: "",
            from : 1,
            size :10,
            total : 0,
            data :[]
        }
    },
    mounted() {
        let vueObj = this;
    },
    methods: {
        searchContent: function () {
            let vueObj = this;
            if (vueObj.searchStr == ""){
                layer.msg("请输入搜索条件！")
                return;
            }
            let params = {
                from:vueObj.from,
                size:vueObj.size,
                searchStr:vueObj.searchStr
            }
            sendPostAjax(ctxPath+"/article/getEsData",params,function(result){
                console.info(result);
                vueObj.data=result.data;
            });
        }
    }
})
