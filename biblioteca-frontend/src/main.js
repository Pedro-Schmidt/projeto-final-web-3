import Vue from 'vue'
import App from './App.vue'
import VueRouter from 'vue-router'

import Menu from './components/Menu.vue'

Vue.config.productionTip = false

Vue.use(VueRouter)

const router = new VueRouter({
  mode: 'history',
  routes: [
    {
      path: '/',
      redirect: '/menu',
      component: Menu
    },
    {
      path: '/menu',
      component: Menu
    }
  ]
})

new Vue({
  router,
  render: h => h(App),
}).$mount('#app')
