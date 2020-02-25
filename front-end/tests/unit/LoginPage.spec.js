import Vue from 'vue'
import LoginPage from '@/views/LoginPage'

describe('LoginPage.vue', () => {
  it('should render correct contents', () => {
    const Contstrctor  = Vue.extend(LoginPage)
      const vm = new Contstrctor().$mount()
      expect(vm.$el.querySelector('h1').textContent).toEqual('TaskAgile')
  })
})
