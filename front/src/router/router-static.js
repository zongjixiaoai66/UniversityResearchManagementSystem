import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
    // 解决多次点击左侧菜单报错问题
    const VueRouterPush = VueRouter.prototype.push
    VueRouter.prototype.push = function push (to) {
    return VueRouterPush.call(this, to).catch(err => err)
    }
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import caozuorizhi from '@/views/modules/caozuorizhi/list'
    import dictionary from '@/views/modules/dictionary/list'
    import fankui from '@/views/modules/fankui/list'
    import gonggao from '@/views/modules/gonggao/list'
    import keyanchengguo from '@/views/modules/keyanchengguo/list'
    import keyanxiangmu from '@/views/modules/keyanxiangmu/list'
    import tongzhi from '@/views/modules/tongzhi/list'
    import xueshuhuodong from '@/views/modules/xueshuhuodong/list'
    import xuexiaoguanliyuan from '@/views/modules/xuexiaoguanliyuan/list'
    import xueyuanbumen from '@/views/modules/xueyuanbumen/list'
    import yonghu from '@/views/modules/yonghu/list'
    import dictionaryDengji from '@/views/modules/dictionaryDengji/list'
    import dictionaryFankui from '@/views/modules/dictionaryFankui/list'
    import dictionaryGonggao from '@/views/modules/dictionaryGonggao/list'
    import dictionaryKeyanchengguo from '@/views/modules/dictionaryKeyanchengguo/list'
    import dictionaryKeyanchengguoLeixing from '@/views/modules/dictionaryKeyanchengguoLeixing/list'
    import dictionaryKeyanchengguoYesno from '@/views/modules/dictionaryKeyanchengguoYesno/list'
    import dictionaryKeyanxiangmuYesno from '@/views/modules/dictionaryKeyanxiangmuYesno/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryTongzhi from '@/views/modules/dictionaryTongzhi/list'
    import dictionaryXueke from '@/views/modules/dictionaryXueke/list'
    import dictionaryXueli from '@/views/modules/dictionaryXueli/list'
    import dictionaryXueshuhuodong from '@/views/modules/dictionaryXueshuhuodong/list'
    import dictionaryXueshuhuodongYesno from '@/views/modules/dictionaryXueshuhuodongYesno/list'
    import dictionaryZhicheng from '@/views/modules/dictionaryZhicheng/list'
    import dictionaryZhiwu from '@/views/modules/dictionaryZhiwu/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryDengji',
        name: '项目等级',
        component: dictionaryDengji
    }
    ,{
        path: '/dictionaryFankui',
        name: '反馈类型',
        component: dictionaryFankui
    }
    ,{
        path: '/dictionaryGonggao',
        name: '公告类型',
        component: dictionaryGonggao
    }
    ,{
        path: '/dictionaryKeyanchengguo',
        name: '成果类别',
        component: dictionaryKeyanchengguo
    }
    ,{
        path: '/dictionaryKeyanchengguoLeixing',
        name: '成果类别',
        component: dictionaryKeyanchengguoLeixing
    }
    ,{
        path: '/dictionaryKeyanchengguoYesno',
        name: '申请状态',
        component: dictionaryKeyanchengguoYesno
    }
    ,{
        path: '/dictionaryKeyanxiangmuYesno',
        name: '申请状态',
        component: dictionaryKeyanxiangmuYesno
    }
    ,{
        path: '/dictionarySex',
        name: '性别类型',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryTongzhi',
        name: '通知类型',
        component: dictionaryTongzhi
    }
    ,{
        path: '/dictionaryXueke',
        name: '学科',
        component: dictionaryXueke
    }
    ,{
        path: '/dictionaryXueli',
        name: '学历',
        component: dictionaryXueli
    }
    ,{
        path: '/dictionaryXueshuhuodong',
        name: '学术活动类型',
        component: dictionaryXueshuhuodong
    }
    ,{
        path: '/dictionaryXueshuhuodongYesno',
        name: '申请状态',
        component: dictionaryXueshuhuodongYesno
    }
    ,{
        path: '/dictionaryZhicheng',
        name: '职称',
        component: dictionaryZhicheng
    }
    ,{
        path: '/dictionaryZhiwu',
        name: '职务',
        component: dictionaryZhiwu
    }


    ,{
        path: '/caozuorizhi',
        name: '操作日志',
        component: caozuorizhi
      }
    ,{
        path: '/dictionary',
        name: '字典',
        component: dictionary
      }
    ,{
        path: '/fankui',
        name: '反馈',
        component: fankui
      }
    ,{
        path: '/gonggao',
        name: '公告',
        component: gonggao
      }
    ,{
        path: '/keyanchengguo',
        name: '科研成果',
        component: keyanchengguo
      }
    ,{
        path: '/keyanxiangmu',
        name: '科研项目',
        component: keyanxiangmu
      }
    ,{
        path: '/tongzhi',
        name: '通知',
        component: tongzhi
      }
    ,{
        path: '/xueshuhuodong',
        name: '学术活动',
        component: xueshuhuodong
      }
    ,{
        path: '/xuexiaoguanliyuan',
        name: '学校管理员',
        component: xuexiaoguanliyuan
      }
    ,{
        path: '/xueyuanbumen',
        name: '学院部门',
        component: xueyuanbumen
      }
    ,{
        path: '/yonghu',
        name: '科研人员',
        component: yonghu
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
