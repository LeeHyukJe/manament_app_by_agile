module.exports = {
  'login test': function (browser) {
    browser
      .url(process.env.VUE_DEV_SERVER_URL + 'login')
      .assert.containsText('h1','TaskAgile')
      .end()
  }
}
