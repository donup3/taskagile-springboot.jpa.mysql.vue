import Vue from 'vue'
import Router from 'vue-router'
import HomePage from '@/views/HomePage'
import LoginPage from '@/views/LoginPage'
import RegisterPage from '@/views/RegisterPage'

Vue.use(Router)

export default new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomePage
    }, {
      path: '/login',
      name: 'LoginPage',
      component: LoginPage
    }, {
      path: '/register',
      name: 'RegisterPage',
      component: RegisterPage
    }]
})
