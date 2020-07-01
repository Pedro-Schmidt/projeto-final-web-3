import Vue from 'vue'
import App from './App.vue'
import VueRouter from 'vue-router'

import Books from './components/Books.vue'
import About from './components/About.vue'

Vue.config.productionTip = false

Vue.use(VueRouter)

const router = new VueRouter({
  mode: 'history',
  routes: [
    {
      path: '/',
      redirect: '/books',
      component: Books
    },
    {
      path: '/books',
      component: Books
    },
    {
      path: '/about',
      component: About
    }
  ]
})

new Vue({
  router,
  render: h => h(App),
}).$mount('#app')
