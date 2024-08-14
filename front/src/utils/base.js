const base = {
    get() {
        return {
            url : "http://localhost:8080/gaoxiaokeyanxinxi/",
            name: "gaoxiaokeyanxinxi",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/gaoxiaokeyanxinxi/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "高校科研信息管理系统"
        } 
    }
}
export default base
