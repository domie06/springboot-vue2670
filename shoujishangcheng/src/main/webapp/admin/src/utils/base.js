const base = {
    get() {
        return {
            url : "http://localhost:8080/shoujishangcheng/",
            name: "shoujishangcheng",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/shoujishangcheng/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "手机官网"
        } 
    }
}
export default base
