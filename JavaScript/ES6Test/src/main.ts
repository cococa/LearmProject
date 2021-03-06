import {  createApp } from 'vue'
import App from './App.vue'
import {createRouter,createWebHashHistory} from 'vue-router';
import c2 from './components/c2.vue'
import c3 from './components/c3.vue'
// import hljs from 'highlight.js'
// import 'highlight.js/styles/googlecode.css' //样式文件

import VueHighlightJS from 'vue3-highlightjs'
import 'highlight.js/styles/solarized-dark.css'
import 'highlight.js/styles/default.css'

const About = { template: '<div>About</div>' }

// 2. 定义一些路由
// 每个路由都需要映射到一个组件。
// 我们后面再讨论嵌套路由。
const routes = [
  { path: '/c2', component: c2 },
  { path: '/c3', component: c3 },
  { path: '/about', component: About },
]

const router = createRouter({
    // 4. 内部提供了 history 模式的实现。为了简单起见，我们在这里使用 hash 模式。
    history: createWebHashHistory(),
    routes, // `routes: routes` 的缩写
  })
  
  // 5. 创建并挂载根实例
  const app = createApp(App)
  //确保 _use_ 路由实例使
  //整个应用支持路由。
  app.use(router)


  app.mount('#app')

  app.use(VueHighlightJS)


// createApp(App).mount('#app')
