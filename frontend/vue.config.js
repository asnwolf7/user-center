const { defineConfig } = require("@vue/cli-service");
module.exports = defineConfig({
  transpileDependencies: true,
  // 本地前端启动端口固定8081
  devServer: {
    port: 8081,
    proxy: {
      // 匹配所有 /api 开头的请求
      "/api": {
        target: "http://127.0.0.1:8080", // 本地后端地址
        changeOrigin: true,
        pathRewrite: {
          "^/api": "/api", // 路径不删除，后端接口前缀就是/api
        },
      },
    },
  },
});
