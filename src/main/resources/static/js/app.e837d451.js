(function(e){function t(t){for(var s,i,o=t[0],l=t[1],m=t[2],u=0,d=[];u<o.length;u++)i=o[u],Object.prototype.hasOwnProperty.call(a,i)&&a[i]&&d.push(a[i][0]),a[i]=0;for(s in l)Object.prototype.hasOwnProperty.call(l,s)&&(e[s]=l[s]);c&&c(t);while(d.length)d.shift()();return n.push.apply(n,m||[]),r()}function r(){for(var e,t=0;t<n.length;t++){for(var r=n[t],s=!0,o=1;o<r.length;o++){var l=r[o];0!==a[l]&&(s=!1)}s&&(n.splice(t--,1),e=i(i.s=r[0]))}return e}var s={},a={app:0},n=[];function i(t){if(s[t])return s[t].exports;var r=s[t]={i:t,l:!1,exports:{}};return e[t].call(r.exports,r,r.exports,i),r.l=!0,r.exports}i.m=e,i.c=s,i.d=function(e,t,r){i.o(e,t)||Object.defineProperty(e,t,{enumerable:!0,get:r})},i.r=function(e){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(e,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(e,"__esModule",{value:!0})},i.t=function(e,t){if(1&t&&(e=i(e)),8&t)return e;if(4&t&&"object"===typeof e&&e&&e.__esModule)return e;var r=Object.create(null);if(i.r(r),Object.defineProperty(r,"default",{enumerable:!0,value:e}),2&t&&"string"!=typeof e)for(var s in e)i.d(r,s,function(t){return e[t]}.bind(null,s));return r},i.n=function(e){var t=e&&e.__esModule?function(){return e["default"]}:function(){return e};return i.d(t,"a",t),t},i.o=function(e,t){return Object.prototype.hasOwnProperty.call(e,t)},i.p="/";var o=window["webpackJsonp"]=window["webpackJsonp"]||[],l=o.push.bind(o);o.push=t,o=o.slice();for(var m=0;m<o.length;m++)t(o[m]);var c=l;n.push(["56d7","chunk-vendors"]),r()})({3726:function(e,t,r){"use strict";var s=r("4a31"),a=r.n(s);a.a},"4a31":function(e,t,r){},"56d7":function(e,t,r){"use strict";r.r(t);r("d3b7"),r("e260"),r("e6cf"),r("cca6"),r("a79d");var s=r("2b0e"),a=function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("div",{attrs:{id:"app"}},[r("router-view")],1)},n=[],i={name:"App"},o=i,l=(r("5c0b"),r("2877")),m=Object(l["a"])(o,a,n,!1,null,null,null),c=m.exports,u=r("8c4f"),d=function(){var e=this,t=e.$createElement;e._self._c;return e._m(0)},f=[function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("div",[r("h1",[e._v("TaskAgile")])])}],v={name:"LoginPage"},p=v,g=Object(l["a"])(p,d,f,!1,null,null,null),h=g.exports,_=function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("div",{staticClass:"container"},[r("div",{staticClass:"row justify-content-center"},[r("div",{staticClass:"register-form"},[e._m(0),r("form",{on:{submit:function(t){return t.preventDefault(),e.submitForm(t)}}},[r("div",{directives:[{name:"show",rawName:"v-show",value:e.errorMessage,expression:"errorMessage"}],staticClass:"alert alert-danger failed"},[e._v(e._s(e.errorMessage))]),r("div",{staticClass:"form-group"},[r("label",{attrs:{for:"username"}},[e._v("Username")]),r("input",{directives:[{name:"model",rawName:"v-model",value:e.form.username,expression:"form.username"}],staticClass:"form-control",attrs:{type:"text",id:"username"},domProps:{value:e.form.username},on:{input:function(t){t.target.composing||e.$set(e.form,"username",t.target.value)}}}),e.$v.form.username.$dirty?r("div",{staticClass:"field-error"},[e.$v.form.username.required?e._e():r("div",{staticClass:"error"},[e._v("Username is required")]),e.$v.form.username.alphaNum?e._e():r("div",{staticClass:"error"},[e._v("Username can only contain letters and numbers")]),e.$v.form.username.minLength?e._e():r("div",{staticClass:"error"},[e._v("Username must have at least "+e._s(e.$v.form.username.$params.minLength.min)+" letters.")]),e.$v.form.username.maxLength?e._e():r("div",{staticClass:"error"},[e._v("Username is too long. It can contains maximium "+e._s(e.$v.form.username.$params.maxLength.max)+" letters.")])]):e._e()]),r("div",{staticClass:"form-group"},[r("label",{attrs:{for:"emailAddress"}},[e._v("Email address")]),r("input",{directives:[{name:"model",rawName:"v-model",value:e.form.emailAddress,expression:"form.emailAddress"}],staticClass:"form-control",attrs:{type:"email",id:"emailAddress"},domProps:{value:e.form.emailAddress},on:{input:function(t){t.target.composing||e.$set(e.form,"emailAddress",t.target.value)}}}),e.$v.form.emailAddress.$dirty?r("div",{staticClass:"field-error"},[e.$v.form.emailAddress.required?e._e():r("div",{staticClass:"error"},[e._v("Email address is required")]),e.$v.form.emailAddress.email?e._e():r("div",{staticClass:"error"},[e._v("This is not a valid email address")]),e.$v.form.emailAddress.maxLength?e._e():r("div",{staticClass:"error"},[e._v("Email address is too long. It can contains maximium "+e._s(e.$v.form.emailAddress.$params.maxLength.max)+" letters.")])]):e._e()]),r("div",{staticClass:"form-group"},[r("label",{attrs:{for:"password"}},[e._v("Password")]),r("input",{directives:[{name:"model",rawName:"v-model",value:e.form.password,expression:"form.password"}],staticClass:"form-control",attrs:{type:"password",id:"password"},domProps:{value:e.form.password},on:{input:function(t){t.target.composing||e.$set(e.form,"password",t.target.value)}}}),e.$v.form.password.$dirty?r("div",{staticClass:"field-error"},[e.$v.form.password.required?e._e():r("div",{staticClass:"error"},[e._v("Password is required")]),e.$v.form.password.minLength?e._e():r("div",{staticClass:"error"},[e._v("Password is too short. It can contains at least "+e._s(e.$v.form.password.$params.minLength.min)+" letters.")]),e.$v.form.password.maxLength?e._e():r("div",{staticClass:"error"},[e._v("Password is too long. It can contains maximium "+e._s(e.$v.form.password.$params.maxLength.max)+" letters.")])]):e._e()]),r("button",{staticClass:"btn btn-primary btn-block",attrs:{type:"submit"}},[e._v("Create account")]),e._m(1),e._m(2)])])]),e._m(3)])},b=[function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("div",{staticClass:"logo-wrapper"},[r("img",{staticClass:"logo",attrs:{src:"/static/images/logo.png"}}),r("div",{staticClass:"tagline"},[e._v("Open source task management tool")])])},function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("p",{staticClass:"accept-terms text-muted"},[e._v("By clicking “Create account”, you agree to our "),r("a",{attrs:{href:"#"}},[e._v("terms of service")]),e._v(" and "),r("a",{attrs:{href:"#"}},[e._v("privacy policy")]),e._v(".")])},function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("p",{staticClass:"text-center text-muted"},[e._v("Already have an account? "),r("a",{attrs:{href:"/login"}},[e._v("Sign in")])])},function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("footer",{staticClass:"footer"},[r("span",{staticClass:"copyright"},[e._v("© 2018 TaskAgile.com")]),r("ul",{staticClass:"footer-links list-inline float-right"},[r("li",{staticClass:"list-inline-item"},[r("a",{attrs:{href:"#"}},[e._v("About")])]),r("li",{staticClass:"list-inline-item"},[r("a",{attrs:{href:"#"}},[e._v("Terms of Service")])]),r("li",{staticClass:"list-inline-item"},[r("a",{attrs:{href:"#"}},[e._v("Privacy Policy")])]),r("li",{staticClass:"list-inline-item"},[r("a",{attrs:{href:"https://github.com/taskagile/vuejs.spring-boot.mysql",target:"_blank"}},[e._v("GitHub")])])])])}],$=r("b5ae"),w=r("bc3a"),C=r.n(w),y={register:function(e){return new Promise((function(t,r){C.a.post("/registrations",e).then((function(e){var r=e.data;t(r)})).catch((function(e){r(e)}))}))}},x={name:"RegisterPage",data:function(){return{form:{username:"",emailAddress:"",password:""},errorMessage:""}},validations:{form:{username:{required:$["required"],minLength:Object($["minLength"])(2),maxLength:Object($["maxLength"])(50),alphaNum:$["alphaNum"]},emailAddress:{required:$["required"],email:$["email"],maxLength:Object($["maxLength"])(100)},password:{required:$["required"],minLength:Object($["minLength"])(6),maxLength:Object($["maxLength"])(30)}}},methods:{submitForm:function(){var e=this;this.$v.$touch(),this.$v.$invalid||y.register(this.form).then((function(){e.$router.push({name:"LoginPage"})})).catch((function(t){e.errorMessage="Failed to register user. "+t.message}))}}},L=x,P=(r("3726"),Object(l["a"])(L,_,b,!1,null,"6d67d79c",null)),j=P.exports;s["a"].use(u["a"]);var O=new u["a"]({mode:"history",base:"/",routes:[{path:"/login",name:"LoginPage",component:h},{path:"/register",name:"Register",component:j}]}),A=O,q=r("2f62");s["a"].use(q["a"]);var k=new q["a"].Store({state:{},mutations:{},actions:{},modules:{}}),E=r("1dce"),M=r.n(E);s["a"].use(M.a),s["a"].config.productionTip=!1,C.a.defaults.baseURL="/api",C.a.defaults.headers.common.Accept="application/json",C.a.interceptors.response.use((function(e){return e}),(function(e){return Promise.reject(e)})),new s["a"]({router:A,store:k,render:function(e){return e(c)}}).$mount("#app")},"5c0b":function(e,t,r){"use strict";var s=r("9c0c"),a=r.n(s);a.a},"9c0c":function(e,t,r){}});
//# sourceMappingURL=app.e837d451.js.map