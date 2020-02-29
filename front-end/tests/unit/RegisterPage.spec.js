import { mount } from "@vue/test-utils";
import RegisterPage from '@/views/RegisterPage'

describe('RegisterPage.vue', ()=>{
  let wrapper
  let fieldUsername
  let fieldEmailAddress
  let fieldPassword
  let buttonSubmit

  beforeEach(()=>{
    wrapper = mount(RegisterPage)
    fieldUsername = wrapper.find('#username')
    fieldEmailAddress = wrapper.find('#emailAddress')
    fieldPassword = wrapper.find('#password')
    buttonSubmit = wrapper.find('form button[type="submit"]')
  })

  it('should render registration form', ()=>{
    expect(wrapper.find('.logo').attributes.src).toEqual('/static/images/logo.png')
    expect(wrapper.find('.tagline').text()).toEqual('Open source task management tool')
    expect(fieldUsername.element.value).toEqual('')
    expect(fieldEmailAddress.element.value).toEqual('')
    expect(fieldPassword.element.value).toEqual('')
  })
})
