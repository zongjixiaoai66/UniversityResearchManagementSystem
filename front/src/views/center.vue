<template>
  <div>
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      label-width="80px"
    >  
     <el-row>
                    <el-col :span="12">
           <el-form-item v-if="flag=='xuexiaoguanliyuan'"  label='学校管理员编号' prop="xuexiaoguanliyuanUuidNumber">
               <el-input v-model="ruleForm.xuexiaoguanliyuanUuidNumber"  placeholder='学校管理员编号' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
           <el-form-item v-if="flag=='xuexiaoguanliyuan'"  label='学校管理员姓名' prop="xuexiaoguanliyuanName">
               <el-input v-model="ruleForm.xuexiaoguanliyuanName"  placeholder='学校管理员姓名' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
           <el-form-item v-if="flag=='xuexiaoguanliyuan'"  label='学校管理员手机号' prop="xuexiaoguanliyuanPhone">
               <el-input v-model="ruleForm.xuexiaoguanliyuanPhone"  placeholder='学校管理员手机号' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
           <el-form-item v-if="flag=='xuexiaoguanliyuan'"  label='学校管理员身份证号' prop="xuexiaoguanliyuanIdNumber">
               <el-input v-model="ruleForm.xuexiaoguanliyuanIdNumber"  placeholder='学校管理员身份证号' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
             <el-form-item v-if="flag=='xuexiaoguanliyuan'" label='学校管理员头像' prop="xuexiaoguanliyuanPhoto">
                 <file-upload
                         tip="点击上传照片"
                         action="file/upload"
                         :limit="3"
                         :multiple="true"
                         :fileUrls="ruleForm.xuexiaoguanliyuanPhoto?$base.url+ruleForm.xuexiaoguanliyuanPhoto:''"
                         @change="xuexiaoguanliyuanPhotoUploadChange"
                 ></file-upload>
             </el-form-item>
         </el-col>
         <el-col :span="12">
           <el-form-item v-if="flag=='xuexiaoguanliyuan'"  label='电子邮箱' prop="xuexiaoguanliyuanEmail">
               <el-input v-model="ruleForm.xuexiaoguanliyuanEmail"  placeholder='电子邮箱' clearable></el-input>
           </el-form-item>
         </el-col>

        <!--<el-col :span="12" v-if="flag=='yonghu'">
            <el-form-item class="select" label="学院部门" prop="xueyuanbumenId">
                <el-select v-model="ruleForm.xueyuanbumenId" filterable placeholder="请选择学院部门" @change="xueyuanbumenChange">
                    <el-option
                            v-for="(item,index) in xueyuanbumenOptions"
                            v-bind:key="item.id"
                                            :label="item.xueyuanbumenName"
                            :value="item.id">
                    </el-option>
                </el-select>
            </el-form-item>
        </el-col>-->
         <el-col :span="12">
             <el-form-item v-if="flag=='yonghu'" label='学院部门编号' prop="xueyuanbumenUuidNumber">
                 <el-input v-model="xueyuanbumenForm.xueyuanbumenUuidNumber" disabled></el-input>
             </el-form-item>
         </el-col>
         <el-col :span="12">
             <el-form-item v-if="flag=='yonghu'" label='学院部门名称' prop="xueyuanbumenName">
                 <el-input v-model="xueyuanbumenForm.xueyuanbumenName" disabled></el-input>
             </el-form-item>
         </el-col>
         <el-col :span="12">
             <el-form-item v-if="flag=='yonghu'" label='学院部门位置' prop="xueyuanbumenAddress">
                 <el-input v-model="xueyuanbumenForm.xueyuanbumenAddress" disabled></el-input>
             </el-form-item>
         </el-col>
         <el-col :span="12">
           <el-form-item v-if="flag=='yonghu'"  label='科研人员编号' prop="yonghuUuidNumber">
               <el-input v-model="ruleForm.yonghuUuidNumber"  placeholder='科研人员编号' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
           <el-form-item v-if="flag=='yonghu'"  label='科研人员姓名' prop="yonghuName">
               <el-input v-model="ruleForm.yonghuName"  placeholder='科研人员姓名' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
           <el-form-item v-if="flag=='yonghu'"  label='科研人员手机号' prop="yonghuPhone">
               <el-input v-model="ruleForm.yonghuPhone"  placeholder='科研人员手机号' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
           <el-form-item v-if="flag=='yonghu'"  label='科研人员身份证号' prop="yonghuIdNumber">
               <el-input v-model="ruleForm.yonghuIdNumber"  placeholder='科研人员身份证号' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
             <el-form-item v-if="flag=='yonghu'" label='科研人员头像' prop="yonghuPhoto">
                 <file-upload
                         tip="点击上传照片"
                         action="file/upload"
                         :limit="3"
                         :multiple="true"
                         :fileUrls="ruleForm.yonghuPhoto?$base.url+ruleForm.yonghuPhoto:''"
                         @change="yonghuPhotoUploadChange"
                 ></file-upload>
             </el-form-item>
         </el-col>
         <el-col :span="12">
           <el-form-item v-if="flag=='yonghu'"  label='年龄' prop="age">
               <el-input v-model="ruleForm.age"  placeholder='年龄' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
           <el-form-item v-if="flag=='yonghu'"  label='电子邮箱' prop="yonghuEmail">
               <el-input v-model="ruleForm.yonghuEmail"  placeholder='电子邮箱' clearable></el-input>
           </el-form-item>
         </el-col>

         <el-col :span="12">
             <el-form-item v-if="flag=='yonghu'"  label='职务' prop="zhiwuTypes">
                 <el-select v-model="ruleForm.zhiwuTypes"  disabled="true"  placeholder='请选择职务'>
                     <el-option
                             v-for="(item,index) in zhiwuTypesOptions"
                             v-bind:key="item.codeIndex"
                             :label="item.indexName"
                             :value="item.codeIndex">
                     </el-option>
                 </el-select>
             </el-form-item>
         </el-col>
         <el-col :span="12">
             <el-form-item v-if="flag=='yonghu'"  label='职称' prop="zhichengTypes">
                 <el-select v-model="ruleForm.zhichengTypes" disabled="true"  placeholder='请选择职称'>
                     <el-option
                             v-for="(item,index) in zhichengTypesOptions"
                             v-bind:key="item.codeIndex"
                             :label="item.indexName"
                             :value="item.codeIndex">
                     </el-option>
                 </el-select>
             </el-form-item>
         </el-col>
         <el-col :span="12">
             <el-form-item v-if="flag=='yonghu'"  label='学历' prop="xueliTypes">
                 <el-select v-model="ruleForm.xueliTypes" disabled="true"   placeholder='请选择学历'>
                     <el-option
                             v-for="(item,index) in xueliTypesOptions"
                             v-bind:key="item.codeIndex"
                             :label="item.indexName"
                             :value="item.codeIndex">
                     </el-option>
                 </el-select>
             </el-form-item>
         </el-col>
         <el-form-item v-if="flag=='users'" label="用户名" prop="username">
             <el-input v-model="ruleForm.username"
                       placeholder="用户名"></el-input>
         </el-form-item>
         <el-col :span="12">
             <el-form-item v-if="flag!='users'"  label="性别" prop="sexTypes">
                 <el-select v-model="ruleForm.sexTypes" placeholder="请选择性别">
                     <el-option
                             v-for="(item,index) in sexTypesOptions"
                             v-bind:key="item.codeIndex"
                             :label="item.indexName"
                             :value="item.codeIndex">
                     </el-option>
                 </el-select>
             </el-form-item>
         </el-col>
         <el-col :span="24">
             <el-form-item>
                 <el-button type="primary" @click="onUpdateHandler">修 改</el-button>
             </el-form-item>
         </el-col>
     </el-row>
    </el-form>
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isMobile,isPhone,isURL,checkIdCard } from "@/utils/validate";

export default {
  data() {
    return {
        ruleForm: {},
        flag: '',
        usersFlag: false,
        // sexTypesOptions : [],
// 注册表 科研人员
    // 注册的类型字段 科研人员
        // 性别
        sexTypesOptions : [],
        // 职务
        zhiwuTypesOptions : [],
        // 职称
        zhichengTypesOptions : [],
        // 学历
        xueliTypesOptions : [],
    // 注册的级联表 科研人员
        // 学院部门列表
        xueyuanbumenOptions : [],
        xueyuanbumenForm:{},
// 注册表 学校管理员
    // 注册的类型字段 学校管理员
        // 性别
        sexTypesOptions : [],
    };
  },
  mounted() {
    //获取当前登录用户的信息
    var table = this.$storage.get("sessionTable");
    this.sessionTable = this.$storage.get("sessionTable");
    this.role = this.$storage.get("role");
    if (this.role != "管理员"){
    }

    this.flag = table;
    this.$http({
      url: `${this.$storage.get("sessionTable")}/session`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.ruleForm = data.data;
// 注册表 科研人员
    // 注册的级联表 科研人员
        if(table == 'yonghu'){
            this.xueyuanbumenChange(this.ruleForm.xueyuanbumenId);
        }
// 注册表 学校管理员
      } else {
        this.$message.error(data.msg);
      }
    });

// 注册表 科研人员 的级联表
    // 注册的级联表 科研人员
        // 学院部门列表
    this.$http({
        url: `xueyuanbumen/page?page=1&limit=100`,
        method: "get"
    }).then(({ data }) => {
        if (data && data.code === 0) {
        this.xueyuanbumenOptions = data.data.list;
        }else{
            this.$message.error(data.msg);
        }
    });
// 注册表 学校管理员 的级联表

      this.$http({
          url: `dictionary/page?page=1&limit=100&sort=&order=&dicCode=sex_types`,
          method: "get"
      }).then(({ data }) => {
          if (data && data.code === 0) {
              this.sexTypesOptions = data.data.list;
          } else {
              this.$message.error(data.msg);
          }
      });
   this.$http({
       url: `dictionary/page?page=1&limit=100&sort=&order=&dicCode=zhiwu_types`,
       method: "get"
   }).then(({ data }) => {
       if (data && data.code === 0) {
          this.zhiwuTypesOptions = data.data.list;
      } else {
          this.$message.error(data.msg);
      }
    });
   this.$http({
       url: `dictionary/page?page=1&limit=100&sort=&order=&dicCode=zhicheng_types`,
       method: "get"
   }).then(({ data }) => {
       if (data && data.code === 0) {
          this.zhichengTypesOptions = data.data.list;
      } else {
          this.$message.error(data.msg);
      }
    });
   this.$http({
       url: `dictionary/page?page=1&limit=100&sort=&order=&dicCode=xueli_types`,
       method: "get"
   }).then(({ data }) => {
       if (data && data.code === 0) {
          this.xueliTypesOptions = data.data.list;
      } else {
          this.$message.error(data.msg);
      }
    });
  },
  methods: {
    chongzhi() {
      this.$router.replace({ path: "/pay" });
    },
    xuexiaoguanliyuanPhotoUploadChange(fileUrls) {
        this.ruleForm.xuexiaoguanliyuanPhoto = fileUrls;
    },
    yonghuPhotoUploadChange(fileUrls) {
        this.ruleForm.yonghuPhoto = fileUrls;
    },
// 注册表的级联表
    xueyuanbumenChange(id){
        this.$http({
            url: `xueyuanbumen/info/`+id,
            method: "get"
        }).then(({ data }) => {
            if (data && data.code === 0) {
                this.xueyuanbumenForm = data.data;
            }
        });
    },


    onUpdateHandler() {
                         if((!this.ruleForm.xuexiaoguanliyuanUuidNumber)&& 'xuexiaoguanliyuan'==this.flag){
                             this.$message.error('学校管理员编号不能为空');
                             return
                         }

                         if((!this.ruleForm.xuexiaoguanliyuanName)&& 'xuexiaoguanliyuan'==this.flag){
                             this.$message.error('学校管理员姓名不能为空');
                             return
                         }

                             if( 'xuexiaoguanliyuan' ==this.flag && this.ruleForm.xuexiaoguanliyuanPhone&&(!isMobile(this.ruleForm.xuexiaoguanliyuanPhone))){
                                 this.$message.error(`手机应输入手机格式`);
                                 return
                             }
                         if((!this.ruleForm.xuexiaoguanliyuanIdNumber)&& 'xuexiaoguanliyuan'==this.flag){
                             this.$message.error('学校管理员身份证号不能为空');
                             return
                         }

                         if((!this.ruleForm.xuexiaoguanliyuanPhoto)&& 'xuexiaoguanliyuan'==this.flag){
                             this.$message.error('学校管理员头像不能为空');
                             return
                         }

                             if( 'xuexiaoguanliyuan' ==this.flag && this.ruleForm.xuexiaoguanliyuanEmail&&(!isEmail(this.ruleForm.xuexiaoguanliyuanEmail))){
                                 this.$message.error(`邮箱应输入邮箱格式`);
                                 return
                             }
                         if((!this.ruleForm.xueyuanbumenId)&& 'yonghu'==this.flag){
                             this.$message.error('学院部门不能为空');
                             return
                         }

                         if((!this.ruleForm.yonghuUuidNumber)&& 'yonghu'==this.flag){
                             this.$message.error('科研人员编号不能为空');
                             return
                         }

                         if((!this.ruleForm.yonghuName)&& 'yonghu'==this.flag){
                             this.$message.error('科研人员姓名不能为空');
                             return
                         }

                             if( 'yonghu' ==this.flag && this.ruleForm.yonghuPhone&&(!isMobile(this.ruleForm.yonghuPhone))){
                                 this.$message.error(`手机应输入手机格式`);
                                 return
                             }
                         if((!this.ruleForm.yonghuIdNumber)&& 'yonghu'==this.flag){
                             this.$message.error('科研人员身份证号不能为空');
                             return
                         }

                         if((!this.ruleForm.yonghuPhoto)&& 'yonghu'==this.flag){
                             this.$message.error('科研人员头像不能为空');
                             return
                         }

                         if((!this.ruleForm.age)&& 'yonghu'==this.flag){
                             this.$message.error('年龄不能为空');
                             return
                         }

                             if( 'yonghu' ==this.flag && this.ruleForm.yonghuEmail&&(!isEmail(this.ruleForm.yonghuEmail))){
                                 this.$message.error(`邮箱应输入邮箱格式`);
                                 return
                             }
                         if((!this.ruleForm.zhiwuTypes)&& 'yonghu'==this.flag){
                             this.$message.error('职务不能为空');
                             return
                         }

                         if((!this.ruleForm.zhichengTypes)&& 'yonghu'==this.flag){
                             this.$message.error('职称不能为空');
                             return
                         }

                         if((!this.ruleForm.xueliTypes)&& 'yonghu'==this.flag){
                             this.$message.error('学历不能为空');
                             return
                         }

        if((!this.ruleForm.sexTypes) && this.flag!='users'){
            this.$message.error('性别不能为空');
            return
        }
      if('users'==this.flag && this.ruleForm.username.trim().length<1) {
        this.$message.error(`用户名不能为空`);
        return	
      }
      this.$http({
        url: `${this.$storage.get("sessionTable")}/update`,
        method: "post",
        data: this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "修改信息成功",
            type: "success",
            duration: 1500,
            onClose: () => {
            }
          });
        } else {
          this.$message.error(data.msg);
        }
      });
    }
  }
};
</script>
<style lang="scss" scoped>
</style>
