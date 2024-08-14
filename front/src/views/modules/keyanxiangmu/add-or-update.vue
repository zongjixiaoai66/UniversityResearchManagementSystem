<template>
    <div class="addEdit-block">
        <el-form
                class="detail-form-content"
                ref="ruleForm"
                :model="ruleForm"
                :rules="rules"
                label-width="auto"
                :style="{backgroundColor:addEditForm.addEditBoxColor}">
            <el-row>
                <el-col :span="12"  v-if="sessionTable !='yonghu'">
                    <el-form-item class="select" v-if="type!='info'"  label="科研人员" prop="yonghuId">
                        <el-select v-model="ruleForm.yonghuId" :disabled="ro.yonghuId" filterable placeholder="请选择科研人员" @change="yonghuChange">
                            <el-option
                                    v-for="(item,index) in yonghuOptions"
                                    v-bind:key="item.id"
                                    :label="item.yonghuName"
                                    :value="item.id">
                            </el-option>
                        </el-select>
                    </el-form-item>
                </el-col>

                <el-col :span="12"  v-if="sessionTable !='yonghu' ">
                    <el-form-item class="input" v-if="type!='info'"  label="科研人员编号" prop="yonghuUuidNumber">
                        <el-input v-model="yonghuForm.yonghuUuidNumber"
                                  placeholder="科研人员编号" clearable readonly></el-input>
                    </el-form-item>
                    <div v-else-if="type=='info'">
                        <el-form-item class="input" label="科研人员编号" prop="yonghuUuidNumber">
                            <el-input v-model="ruleForm.yonghuUuidNumber"
                                      placeholder="科研人员编号" readonly></el-input>
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="12"  v-if="sessionTable !='yonghu' ">
                    <el-form-item class="input" v-if="type!='info'"  label="科研人员姓名" prop="yonghuName">
                        <el-input v-model="yonghuForm.yonghuName"
                                  placeholder="科研人员姓名" clearable readonly></el-input>
                    </el-form-item>
                    <div v-else-if="type=='info'">
                        <el-form-item class="input" label="科研人员姓名" prop="yonghuName">
                            <el-input v-model="ruleForm.yonghuName"
                                      placeholder="科研人员姓名" readonly></el-input>
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="12"  v-if="sessionTable !='yonghu' ">
                    <el-form-item class="input" v-if="type!='info'"  label="科研人员手机号" prop="yonghuPhone">
                        <el-input v-model="yonghuForm.yonghuPhone"
                                  placeholder="科研人员手机号" clearable readonly></el-input>
                    </el-form-item>
                    <div v-else-if="type=='info'">
                        <el-form-item class="input" label="科研人员手机号" prop="yonghuPhone">
                            <el-input v-model="ruleForm.yonghuPhone"
                                      placeholder="科研人员手机号" readonly></el-input>
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="12"  v-if="sessionTable !='yonghu' ">
                    <el-form-item class="input" v-if="type!='info'"  label="科研人员身份证号" prop="yonghuIdNumber">
                        <el-input v-model="yonghuForm.yonghuIdNumber"
                                  placeholder="科研人员身份证号" clearable readonly></el-input>
                    </el-form-item>
                    <div v-else-if="type=='info'">
                        <el-form-item class="input" label="科研人员身份证号" prop="yonghuIdNumber">
                            <el-input v-model="ruleForm.yonghuIdNumber"
                                      placeholder="科研人员身份证号" readonly></el-input>
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="12" v-if="sessionTable !='yonghu' ">
                    <el-form-item class="upload" v-if="type!='info' && !ro.yonghuPhoto" label="科研人员头像" prop="yonghuPhoto">
                        <img style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in (yonghuForm.yonghuPhoto || '').split(',')" :src="$base.url+item" width="100" height="100">
                    </el-form-item>
                    <div v-else-if="type=='info'">
                        <el-form-item v-if="ruleForm.yonghuPhoto" label="科研人员头像" prop="yonghuPhoto">
                            <img style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in (ruleForm.yonghuPhoto || '').split(',')" :src="$base.url+item" width="100" height="100">
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="12"  v-if="sessionTable !='yonghu' ">
                    <el-form-item class="input" v-if="type!='info'"  label="年龄" prop="age">
                        <el-input v-model="yonghuForm.age"
                                  placeholder="年龄" clearable readonly></el-input>
                    </el-form-item>
                    <div v-else-if="type=='info'">
                        <el-form-item class="input" label="年龄" prop="age">
                            <el-input v-model="ruleForm.age"
                                      placeholder="年龄" readonly></el-input>
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="12"  v-if="sessionTable !='yonghu' ">
                    <el-form-item class="input" v-if="type!='info'"  label="电子邮箱" prop="yonghuEmail">
                        <el-input v-model="yonghuForm.yonghuEmail"
                                  placeholder="电子邮箱" clearable readonly></el-input>
                    </el-form-item>
                    <div v-else-if="type=='info'">
                        <el-form-item class="input" label="电子邮箱" prop="yonghuEmail">
                            <el-input v-model="ruleForm.yonghuEmail"
                                      placeholder="电子邮箱" readonly></el-input>
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="12"  v-if="sessionTable !='yonghu' ">
                    <el-form-item class="input" v-if="type!='info'"  label="职务" prop="zhiwuValue">
                        <el-input v-model="yonghuForm.zhiwuValue"
                                  placeholder="职务" clearable readonly></el-input>
                    </el-form-item>
                    <div v-else-if="type=='info'">
                        <el-form-item class="input" label="职务" prop="zhiwuValue">
                            <el-input v-model="ruleForm.zhiwuValue"
                                      placeholder="职务" readonly></el-input>
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="12"  v-if="sessionTable !='yonghu' ">
                    <el-form-item class="input" v-if="type!='info'"  label="职称" prop="zhichengValue">
                        <el-input v-model="yonghuForm.zhichengValue"
                                  placeholder="职称" clearable readonly></el-input>
                    </el-form-item>
                    <div v-else-if="type=='info'">
                        <el-form-item class="input" label="职称" prop="zhichengValue">
                            <el-input v-model="ruleForm.zhichengValue"
                                      placeholder="职称" readonly></el-input>
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="12"  v-if="sessionTable !='yonghu' ">
                    <el-form-item class="input" v-if="type!='info'"  label="学历" prop="xueliValue">
                        <el-input v-model="yonghuForm.xueliValue"
                                  placeholder="学历" clearable readonly></el-input>
                    </el-form-item>
                    <div v-else-if="type=='info'">
                        <el-form-item class="input" label="学历" prop="xueliValue">
                            <el-input v-model="ruleForm.xueliValue"
                                      placeholder="学历" readonly></el-input>
                        </el-form-item>
                    </div>
                </el-col>
                <input id="updateId" name="id" type="hidden">
            <input id="yonghuId" name="yonghuId" type="hidden">
               <el-col :span="12">
                   <el-form-item class="input" v-if="type!='info'"  label="科研项目编号" prop="keyanxiangmuUuidNumber">
                       <el-input v-model="ruleForm.keyanxiangmuUuidNumber"
                                 placeholder="科研项目编号" clearable  :readonly="ro.keyanxiangmuUuidNumber"></el-input>
                   </el-form-item>
                   <div v-else-if="type=='info'">
                       <el-form-item class="input" label="科研项目编号" prop="keyanxiangmuUuidNumber">
                           <el-input v-model="ruleForm.keyanxiangmuUuidNumber"
                                     placeholder="科研项目编号" readonly></el-input>
                       </el-form-item>
                   </div>
               </el-col>
               <el-col :span="12">
                   <el-form-item class="input" v-if="type!='info'"  label="项目来源" prop="keyanxiangmuLaiyuan">
                       <el-input v-model="ruleForm.keyanxiangmuLaiyuan"
                                 placeholder="项目来源" clearable  :readonly="ro.keyanxiangmuLaiyuan"></el-input>
                   </el-form-item>
                   <div v-else-if="type=='info'">
                       <el-form-item class="input" label="项目来源" prop="keyanxiangmuLaiyuan">
                           <el-input v-model="ruleForm.keyanxiangmuLaiyuan"
                                     placeholder="项目来源" readonly></el-input>
                       </el-form-item>
                   </div>
               </el-col>
               <el-col :span="12">
                   <el-form-item class="input" v-if="type!='info'"  label="科研项目名称" prop="keyanxiangmuName">
                       <el-input v-model="ruleForm.keyanxiangmuName"
                                 placeholder="科研项目名称" clearable  :readonly="ro.keyanxiangmuName"></el-input>
                   </el-form-item>
                   <div v-else-if="type=='info'">
                       <el-form-item class="input" label="科研项目名称" prop="keyanxiangmuName">
                           <el-input v-model="ruleForm.keyanxiangmuName"
                                     placeholder="科研项目名称" readonly></el-input>
                       </el-form-item>
                   </div>
               </el-col>
                <el-col :span="12">
                    <el-form-item class="select" v-if="type!='info'"  label="项目等级" prop="dengjiTypes">
                        <el-select v-model="ruleForm.dengjiTypes" :disabled="ro.dengjiTypes" placeholder="请选择项目等级">
                            <el-option
                                v-for="(item,index) in dengjiTypesOptions"
                                v-bind:key="item.codeIndex"
                                :label="item.indexName"
                                :value="item.codeIndex">
                            </el-option>
                        </el-select>
                    </el-form-item>
                    <div v-else-if="type=='info'">
                        <el-form-item class="input" label="项目等级" prop="dengjiValue">
                        <el-input v-model="ruleForm.dengjiValue"
                            placeholder="项目等级" readonly></el-input>
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="12">
                    <el-form-item class="select" v-if="type!='info'"  label="学科" prop="xuekeTypes">
                        <el-select v-model="ruleForm.xuekeTypes" :disabled="ro.xuekeTypes" placeholder="请选择学科">
                            <el-option
                                v-for="(item,index) in xuekeTypesOptions"
                                v-bind:key="item.codeIndex"
                                :label="item.indexName"
                                :value="item.codeIndex">
                            </el-option>
                        </el-select>
                    </el-form-item>
                    <div v-else-if="type=='info'">
                        <el-form-item class="input" label="学科" prop="xuekeValue">
                        <el-input v-model="ruleForm.xuekeValue"
                            placeholder="学科" readonly></el-input>
                        </el-form-item>
                    </div>
                </el-col>
               <el-col :span="12">
                   <el-form-item class="input" v-if="type!='info'"  label="项目预算(元)" prop="keyanxiangmuHuafei">
                       <el-input v-model="ruleForm.keyanxiangmuHuafei"
                                 placeholder="项目预算(元)" clearable  :readonly="ro.keyanxiangmuHuafei"></el-input>
                   </el-form-item>
                   <div v-else-if="type=='info'">
                       <el-form-item class="input" label="项目预算(元)" prop="keyanxiangmuHuafei">
                           <el-input v-model="ruleForm.keyanxiangmuHuafei"
                                     placeholder="项目预算(元)" readonly></el-input>
                       </el-form-item>
                   </div>
               </el-col>
                <el-col :span="12">
                    <el-form-item v-if="type!='info'"  class="input" label="项目开始时间" prop="kaishiTime">
                        <el-date-picker
                                value-format="yyyy-MM-dd HH:mm:ss"
                                v-model="ruleForm.kaishiTime"
                                type="datetime"
                                placeholder="项目开始时间"
                                :disabled="ro.kaishiTime">
                        </el-date-picker>
                    </el-form-item>
                    <div v-else-if="type=='info'">
                        <el-form-item v-if="ruleForm.kaishiTime" label="项目开始时间" prop="kaishiTime">
                            <span v-html="ruleForm.kaishiTime"></span>
                        </el-form-item>
                    </div>
                </el-col>

                <el-col :span="12">
                    <el-form-item v-if="type!='info'"  class="input" label="项目结束时间" prop="jieshuTime">
                        <el-date-picker
                                value-format="yyyy-MM-dd HH:mm:ss"
                                v-model="ruleForm.jieshuTime"
                                type="datetime"
                                placeholder="项目结束时间"
                                :disabled="ro.jieshuTime">
                        </el-date-picker>
                    </el-form-item>
                    <div v-else-if="type=='info'">
                        <el-form-item v-if="ruleForm.jieshuTime" label="项目结束时间" prop="jieshuTime">
                            <span v-html="ruleForm.jieshuTime"></span>
                        </el-form-item>
                    </div>
                </el-col>

                <el-col :span="12">
                    <el-form-item class="upload" v-if="type!='info' && !ro.keyanxiangmuFile" label="项目申报书" prop="keyanxiangmuFile">
                        <file-upload
                                tip="点击上传项目申报书"
                                action="file/upload"
                                :limit="3"
                                :multiple="true"
                                :fileUrls="ruleForm.keyanxiangmuFile?$base.url+ruleForm.keyanxiangmuFile:''"
                                @change="keyanxiangmuFileUploadChange"
                        ></file-upload>
                    </el-form-item>
                    <div v-else>
                        <el-form-item v-if="ruleForm.keyanxiangmuFile" label="项目申报书" prop="keyanxiangmuFile">
                            <a type="text" style="text-decoration:none" class="el-button" :href="$base.url+ruleForm.keyanxiangmuFile"  >项目申报书下载</a>
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="24">
                    <el-form-item v-if="type!='info'"  label="科研项目介绍" prop="keyanxiangmuContent">
                        <editor style="min-width: 200px; max-width: 600px;"
                                v-model="ruleForm.keyanxiangmuContent"
                                class="editor"
                                action="file/upload">
                        </editor>
                    </el-form-item>
                    <div v-else-if="type=='info'">
                        <el-form-item v-if="ruleForm.keyanxiangmuContent" label="科研项目介绍" prop="keyanxiangmuContent">
                            <span v-html="ruleForm.keyanxiangmuContent"></span>
                        </el-form-item>
                    </div>
                </el-col>
            <el-col :span="12" v-if="type=='info'">
                <div>
                    <el-form-item v-if="ruleForm.keyanxiangmuYesnoTypes" label="申请状态" prop="keyanxiangmuYesnoTypes">
                        <el-input v-model="ruleForm.keyanxiangmuYesnoValue" placeholder="申请状态" readonly></el-input>
                    </el-form-item>
                </div>
            </el-col>
            <el-col :span="12" v-if="type=='info'">
                <div>
                    <el-form-item v-if="ruleForm.keyanxiangmuYesnoText" label="审核意见" prop="keyanxiangmuYesnoText">
                        <span v-html="ruleForm.keyanxiangmuYesnoText"></span>
                    </el-form-item>
                </div>
            </el-col>
            <el-col :span="12" v-if="type=='info'">
                <div>
                    <el-form-item v-if="ruleForm.keyanxiangmuShenheTime" label="审核时间" prop="keyanxiangmuShenheTime">
                        <span v-html="ruleForm.keyanxiangmuShenheTime"></span>
                    </el-form-item>
                </div>
            </el-col>
                <el-col :span="12">
                    <el-form-item class="upload" v-if="type!='info' && !ro.keyanxiangmuLixiangFile && !(sessionTable=='yonghu' &&ruleForm.id==null)" label="项目立项文件" prop="keyanxiangmuLixiangFile">
                        <file-upload
                                tip="点击上传项目立项文件"
                                action="file/upload"
                                :limit="3"
                                :multiple="true"
                                :fileUrls="ruleForm.keyanxiangmuLixiangFile?$base.url+ruleForm.keyanxiangmuLixiangFile:''"
                                @change="keyanxiangmuLixiangFileUploadChange"
                        ></file-upload>
                    </el-form-item>
                    <div  v-else-if="type=='info'">
                        <el-form-item v-if="ruleForm.keyanxiangmuLixiangFile" label="项目立项文件" prop="keyanxiangmuLixiangFile">
                            <a type="text" style="text-decoration:none" class="el-button" :href="$base.url+ruleForm.keyanxiangmuLixiangFile"  >项目立项文件下载</a>
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="12">
                    <el-form-item class="upload" v-if="type!='info' && !ro.keyanxiangmuJiexiangFile && !(sessionTable=='yonghu' &&ruleForm.id==null)" label="项目结项书" prop="keyanxiangmuJiexiangFile">
                        <file-upload
                                tip="点击上传项目结项书"
                                action="file/upload"
                                :limit="3"
                                :multiple="true"
                                :fileUrls="ruleForm.keyanxiangmuJiexiangFile?$base.url+ruleForm.keyanxiangmuJiexiangFile:''"
                                @change="keyanxiangmuJiexiangFileUploadChange"
                        ></file-upload>
                    </el-form-item>
                    <div  v-else-if="type=='info'">
                        <el-form-item v-if="ruleForm.keyanxiangmuJiexiangFile" label="项目结项书" prop="keyanxiangmuJiexiangFile">
                            <a type="text" style="text-decoration:none" class="el-button" :href="$base.url+ruleForm.keyanxiangmuJiexiangFile"  >项目结项书下载</a>
                        </el-form-item>
                    </div>
                </el-col>
                <el-col :span="12">
                    <el-form-item class="upload" v-if="type!='info' && !ro.keyanxiangmuJiexiangwenjianFile && !(sessionTable=='yonghu' &&ruleForm.id==null)" label="项目结项文件" prop="keyanxiangmuJiexiangwenjianFile">
                        <file-upload
                                tip="点击上传项目结项文件"
                                action="file/upload"
                                :limit="3"
                                :multiple="true"
                                :fileUrls="ruleForm.keyanxiangmuJiexiangwenjianFile?$base.url+ruleForm.keyanxiangmuJiexiangwenjianFile:''"
                                @change="keyanxiangmuJiexiangwenjianFileUploadChange"
                        ></file-upload>
                    </el-form-item>
                    <div  v-else-if="type=='info'">
                        <el-form-item v-if="ruleForm.keyanxiangmuJiexiangwenjianFile" label="项目结项文件" prop="keyanxiangmuJiexiangwenjianFile">
                            <a type="text" style="text-decoration:none" class="el-button" :href="$base.url+ruleForm.keyanxiangmuJiexiangwenjianFile"  >项目结项文件下载</a>
                        </el-form-item>
                    </div>
                </el-col>
            </el-row>
            <el-form-item class="btn">
                <el-button v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">提交</el-button>
                <el-button v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
                <el-button v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
            </el-form-item>
        </el-form>
    </div>
</template>
<script>
    import styleJs from "../../../utils/style.js";
    // 数字，邮件，手机，url，身份证校验
    import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
    export default {
        data() {
            return {
                addEditForm:null,
                id: '',
                type: '',
                sessionTable : "",//登录账户所在表名
                role : "",//权限
                userId:"",//当前登录人的id
                yonghuForm: {},
                ro:{
                    yonghuId: false,
                    keyanxiangmuUuidNumber: false,
                    keyanxiangmuLaiyuan: false,
                    keyanxiangmuName: false,
                    dengjiTypes: false,
                    xuekeTypes: false,
                    keyanxiangmuHuafei: false,
                    kaishiTime: false,
                    jieshuTime: false,
                    keyanxiangmuFile: false,
                    keyanxiangmuContent: false,
                    insertTime: false,
                    keyanxiangmuYesnoTypes: false,
                    keyanxiangmuYesnoText: false,
                    keyanxiangmuShenheTime: false,
                    keyanxiangmuLixiangFile: false,
                    keyanxiangmuJiexiangFile: false,
                    keyanxiangmuJiexiangwenjianFile: false,
                },
                ruleForm: {
                    yonghuId: '',
                    keyanxiangmuUuidNumber: new Date().getTime(),
                    keyanxiangmuLaiyuan: '',
                    keyanxiangmuName: '',
                    dengjiTypes: '',
                    xuekeTypes: '',
                    keyanxiangmuHuafei: '',
                    kaishiTime: '',
                    jieshuTime: '',
                    keyanxiangmuFile: '',
                    keyanxiangmuContent: '',
                    insertTime: '',
                    keyanxiangmuYesnoTypes: '',
                    keyanxiangmuYesnoText: '',
                    keyanxiangmuShenheTime: '',
                    keyanxiangmuLixiangFile: '',
                    keyanxiangmuJiexiangFile: '',
                    keyanxiangmuJiexiangwenjianFile: '',
                },
                dengjiTypesOptions : [],
                xuekeTypesOptions : [],
                keyanxiangmuYesnoTypesOptions : [],
                yonghuOptions : [],
                rules: {
                   yonghuId: [
                              { required: true, message: '科研人员不能为空', trigger: 'blur' },
                              {  pattern: /^[0-9]*$/,
                                  message: '只允许输入整数',
                                  trigger: 'blur'
                              }
                          ],
                   keyanxiangmuUuidNumber: [
                              { required: true, message: '科研项目编号不能为空', trigger: 'blur' },
                          ],
                   keyanxiangmuLaiyuan: [
                              { required: true, message: '项目来源不能为空', trigger: 'blur' },
                          ],
                   keyanxiangmuName: [
                              { required: true, message: '科研项目名称不能为空', trigger: 'blur' },
                          ],
                   dengjiTypes: [
                              { required: true, message: '项目等级不能为空', trigger: 'blur' },
                              {  pattern: /^[0-9]*$/,
                                  message: '只允许输入整数',
                                  trigger: 'blur'
                              }
                          ],
                   xuekeTypes: [
                              { required: true, message: '学科不能为空', trigger: 'blur' },
                              {  pattern: /^[0-9]*$/,
                                  message: '只允许输入整数',
                                  trigger: 'blur'
                              }
                          ],
                   keyanxiangmuHuafei: [
                              { required: true, message: '项目预算(元)不能为空', trigger: 'blur' },
                              {  pattern: /^[0-9]*$/,
                                  message: '只允许输入整数',
                                  trigger: 'blur'
                              }
                          ],
                   kaishiTime: [
                              { required: true, message: '项目开始时间不能为空', trigger: 'blur' },
                          ],
                   jieshuTime: [
                              { required: true, message: '项目结束时间不能为空', trigger: 'blur' },
                          ],
                   keyanxiangmuFile: [
                              { required: true, message: '项目申报书不能为空', trigger: 'blur' },
                          ],
                   keyanxiangmuContent: [
                              { required: true, message: '科研项目介绍不能为空', trigger: 'blur' },
                          ],
                   insertTime: [
                              { required: true, message: '申请时间不能为空', trigger: 'blur' },
                          ],
                   keyanxiangmuYesnoTypes: [
                              { required: true, message: '申请状态不能为空', trigger: 'blur' },
                              {  pattern: /^[0-9]*$/,
                                  message: '只允许输入整数',
                                  trigger: 'blur'
                              }
                          ],
                   keyanxiangmuYesnoText: [
                              { required: true, message: '审核意见不能为空', trigger: 'blur' },
                          ],
                   keyanxiangmuShenheTime: [
                              { required: true, message: '审核时间不能为空', trigger: 'blur' },
                          ],
                   keyanxiangmuLixiangFile: [
                              { required: true, message: '项目立项文件不能为空', trigger: 'blur' },
                          ],
                   keyanxiangmuJiexiangFile: [
                              { required: true, message: '项目结项书不能为空', trigger: 'blur' },
                          ],
                   keyanxiangmuJiexiangwenjianFile: [
                              { required: true, message: '项目结项文件不能为空', trigger: 'blur' },
                          ],
                }
            };
        },
        props: ["parent"],
        computed: {
        },
        created() {
            //获取当前登录用户的信息
            this.sessionTable = this.$storage.get("sessionTable");
            this.role = this.$storage.get("role");
            this.userId = this.$storage.get("userId");


            if (this.role != "管理员"){
            }
            this.addEditForm = styleJs.addStyle();
            this.addEditStyleChange()
            this.addEditUploadStyleChange()
            //获取下拉框信息
                this.$http({
                    url:`dictionary/page?page=1&limit=100&sort=&order=&dicCode=dengji_types`,
                    method: "get"
                }).then(({ data }) => {
                    if (data && data.code === 0) {
                        this.dengjiTypesOptions = data.data.list;
                    }
                });
                this.$http({
                    url:`dictionary/page?page=1&limit=100&sort=&order=&dicCode=xueke_types`,
                    method: "get"
                }).then(({ data }) => {
                    if (data && data.code === 0) {
                        this.xuekeTypesOptions = data.data.list;
                    }
                });
                this.$http({
                    url:`dictionary/page?page=1&limit=100&sort=&order=&dicCode=keyanxiangmu_yesno_types`,
                    method: "get"
                }).then(({ data }) => {
                    if (data && data.code === 0) {
                        this.keyanxiangmuYesnoTypesOptions = data.data.list;
                    }
                });

         this.$http({
             url: `yonghu/page?page=1&limit=100`,
             method: "get"
         }).then(({ data }) => {
             if (data && data.code === 0) {
                this.yonghuOptions = data.data.list;
            }
         });

        },
        mounted() {
        },
        methods: {
            // 下载
            download(file){
                window.open(`${file}`)
            },
            // 初始化
            init(id,type) {
                if (id) {
                    this.id = id;
                    this.type = type;
                }
                if(this.type=='info'||this.type=='else'){
                    this.info(id);
                }
                // 获取用户信息
                this.$http({
                    url:`${this.$storage.get("sessionTable")}/session`,
                    method: "get"
                }).then(({ data }) => {
                    if (data && data.code === 0) {
                        var json = data.data;
                    } else {
                        this.$message.error(data.msg);
                    }
                });
            },
            yonghuChange(id){
                this.$http({
                    url: `yonghu/info/`+id,
                    method: "get"
                }).then(({ data }) => {
                    if (data && data.code === 0) {
                        this.yonghuForm = data.data;
                    }
                });
            },
            // 多级联动参数
            info(id) {
                let _this =this;
                _this.$http({
                    url: `keyanxiangmu/info/${id}`,
                    method: 'get'
                }).then(({ data }) => {
                    if (data && data.code === 0) {
                        _this.ruleForm = data.data;
                        _this.yonghuChange(data.data.yonghuId)
                        _this.ruleForm.keyanxiangmuContent = _this.ruleForm.keyanxiangmuContent.replaceAll("src=\"upload/","src=\""+this.$base.url+"upload/");
                    } else {
                        _this.$message.error(data.msg);
                    }
                });
            },
            // 提交
            onSubmit() {
                this.$refs["ruleForm"].validate(valid => {
                    if (valid) {
                        this.ruleForm.keyanxiangmuContent = this.ruleForm.keyanxiangmuContent.replaceAll(this.$base.url,"");
                        this.$http({
                            url:`keyanxiangmu/${!this.ruleForm.id ? "save" : "update"}`,
                            method: "post",
                            data: this.ruleForm
                        }).then(({ data }) => {
                            if (data && data.code === 0) {
                                this.$message({
                                    message: "操作成功",
                                    type: "success",
                                    duration: 1500,
                                    onClose: () => {
                                        this.parent.showFlag = true;
                                        this.parent.addOrUpdateFlag = false;
                                        this.parent.keyanxiangmuCrossAddOrUpdateFlag = false;
                                        this.parent.search();
                                        this.parent.contentStyleChange();
                                    }
                                });
                            } else {
                                this.$message.error(data.msg);
                            }
                        });
                    }
                });
            },
            // 获取uuid
            getUUID () {
                return new Date().getTime();
            },
            // 返回
            back() {
                this.parent.showFlag = true;
                this.parent.addOrUpdateFlag = false;
                this.parent.keyanxiangmuCrossAddOrUpdateFlag = false;
                this.parent.contentStyleChange();
            },
            //图片
            keyanxiangmuFileUploadChange(fileUrls){
                this.ruleForm.keyanxiangmuFile = fileUrls;
                this.addEditUploadStyleChange()
            },
            keyanxiangmuLixiangFileUploadChange(fileUrls){
                this.ruleForm.keyanxiangmuLixiangFile = fileUrls;
                this.addEditUploadStyleChange()
            },
            keyanxiangmuJiexiangFileUploadChange(fileUrls){
                this.ruleForm.keyanxiangmuJiexiangFile = fileUrls;
                this.addEditUploadStyleChange()
            },
            keyanxiangmuJiexiangwenjianFileUploadChange(fileUrls){
                this.ruleForm.keyanxiangmuJiexiangwenjianFile = fileUrls;
                this.addEditUploadStyleChange()
            },

            addEditStyleChange() {
                this.$nextTick(()=>{
                    // input
                    document.querySelectorAll('.addEdit-block .input .el-input__inner').forEach(el=>{
                        el.style.height = this.addEditForm.inputHeight
                        el.style.color = this.addEditForm.inputFontColor
                        el.style.fontSize = this.addEditForm.inputFontSize
                        el.style.borderWidth = this.addEditForm.inputBorderWidth
                        el.style.borderStyle = this.addEditForm.inputBorderStyle
                        el.style.borderColor = this.addEditForm.inputBorderColor
                        el.style.borderRadius = this.addEditForm.inputBorderRadius
                        el.style.backgroundColor = this.addEditForm.inputBgColor
                    })
                    document.querySelectorAll('.addEdit-block .input .el-form-item__label').forEach(el=>{
                        el.style.lineHeight = this.addEditForm.inputHeight
                        el.style.color = this.addEditForm.inputLableColor
                        el.style.fontSize = this.addEditForm.inputLableFontSize
                    })
                    // select
                    document.querySelectorAll('.addEdit-block .select .el-input__inner').forEach(el=>{
                        el.style.height = this.addEditForm.selectHeight
                        el.style.color = this.addEditForm.selectFontColor
                        el.style.fontSize = this.addEditForm.selectFontSize
                        el.style.borderWidth = this.addEditForm.selectBorderWidth
                        el.style.borderStyle = this.addEditForm.selectBorderStyle
                        el.style.borderColor = this.addEditForm.selectBorderColor
                        el.style.borderRadius = this.addEditForm.selectBorderRadius
                        el.style.backgroundColor = this.addEditForm.selectBgColor
                    })
                    document.querySelectorAll('.addEdit-block .select .el-form-item__label').forEach(el=>{
                        el.style.lineHeight = this.addEditForm.selectHeight
                        el.style.color = this.addEditForm.selectLableColor
                        el.style.fontSize = this.addEditForm.selectLableFontSize
                    })
                    document.querySelectorAll('.addEdit-block .select .el-select__caret').forEach(el=>{
                        el.style.color = this.addEditForm.selectIconFontColor
                        el.style.fontSize = this.addEditForm.selectIconFontSize
                    })
                    // date
                    document.querySelectorAll('.addEdit-block .date .el-input__inner').forEach(el=>{
                        el.style.height = this.addEditForm.dateHeight
                        el.style.color = this.addEditForm.dateFontColor
                        el.style.fontSize = this.addEditForm.dateFontSize
                        el.style.borderWidth = this.addEditForm.dateBorderWidth
                        el.style.borderStyle = this.addEditForm.dateBorderStyle
                        el.style.borderColor = this.addEditForm.dateBorderColor
                        el.style.borderRadius = this.addEditForm.dateBorderRadius
                        el.style.backgroundColor = this.addEditForm.dateBgColor
                    })
                    document.querySelectorAll('.addEdit-block .date .el-form-item__label').forEach(el=>{
                        el.style.lineHeight = this.addEditForm.dateHeight
                        el.style.color = this.addEditForm.dateLableColor
                        el.style.fontSize = this.addEditForm.dateLableFontSize
                    })
                    document.querySelectorAll('.addEdit-block .date .el-input__icon').forEach(el=>{
                        el.style.color = this.addEditForm.dateIconFontColor
                        el.style.fontSize = this.addEditForm.dateIconFontSize
                        el.style.lineHeight = this.addEditForm.dateHeight
                    })
                    // upload
                    let iconLineHeight = parseInt(this.addEditForm.uploadHeight) - parseInt(this.addEditForm.uploadBorderWidth) * 2 + 'px'
                    document.querySelectorAll('.addEdit-block .upload .el-upload--picture-card').forEach(el=>{
                        el.style.width = this.addEditForm.uploadHeight
                        el.style.height = this.addEditForm.uploadHeight
                        el.style.borderWidth = this.addEditForm.uploadBorderWidth
                        el.style.borderStyle = this.addEditForm.uploadBorderStyle
                        el.style.borderColor = this.addEditForm.uploadBorderColor
                        el.style.borderRadius = this.addEditForm.uploadBorderRadius
                        el.style.backgroundColor = this.addEditForm.uploadBgColor
                    })
                    document.querySelectorAll('.addEdit-block .upload .el-form-item__label').forEach(el=>{
                        el.style.lineHeight = this.addEditForm.uploadHeight
                        el.style.color = this.addEditForm.uploadLableColor
                        el.style.fontSize = this.addEditForm.uploadLableFontSize
                    })
                    document.querySelectorAll('.addEdit-block .upload .el-icon-plus').forEach(el=>{
                        el.style.color = this.addEditForm.uploadIconFontColor
                        el.style.fontSize = this.addEditForm.uploadIconFontSize
                        el.style.lineHeight = iconLineHeight
                        el.style.display = 'block'
                    })
                    // 多文本输入框
                    document.querySelectorAll('.addEdit-block .textarea .el-textarea__inner').forEach(el=>{
                        el.style.height = this.addEditForm.textareaHeight
                        el.style.color = this.addEditForm.textareaFontColor
                        el.style.fontSize = this.addEditForm.textareaFontSize
                        el.style.borderWidth = this.addEditForm.textareaBorderWidth
                        el.style.borderStyle = this.addEditForm.textareaBorderStyle
                        el.style.borderColor = this.addEditForm.textareaBorderColor
                        el.style.borderRadius = this.addEditForm.textareaBorderRadius
                        el.style.backgroundColor = this.addEditForm.textareaBgColor
                    })
                    document.querySelectorAll('.addEdit-block .textarea .el-form-item__label').forEach(el=>{
                        // el.style.lineHeight = this.addEditForm.textareaHeight
                        el.style.color = this.addEditForm.textareaLableColor
                        el.style.fontSize = this.addEditForm.textareaLableFontSize
                    })
                    // 保存
                    document.querySelectorAll('.addEdit-block .btn .btn-success').forEach(el=>{
                        el.style.width = this.addEditForm.btnSaveWidth
                        el.style.height = this.addEditForm.btnSaveHeight
                        el.style.color = this.addEditForm.btnSaveFontColor
                        el.style.fontSize = this.addEditForm.btnSaveFontSize
                        el.style.borderWidth = this.addEditForm.btnSaveBorderWidth
                        el.style.borderStyle = this.addEditForm.btnSaveBorderStyle
                        el.style.borderColor = this.addEditForm.btnSaveBorderColor
                        el.style.borderRadius = this.addEditForm.btnSaveBorderRadius
                        el.style.backgroundColor = this.addEditForm.btnSaveBgColor
                    })
                    // 返回
                    document.querySelectorAll('.addEdit-block .btn .btn-close').forEach(el=>{
                        el.style.width = this.addEditForm.btnCancelWidth
                        el.style.height = this.addEditForm.btnCancelHeight
                        el.style.color = this.addEditForm.btnCancelFontColor
                        el.style.fontSize = this.addEditForm.btnCancelFontSize
                        el.style.borderWidth = this.addEditForm.btnCancelBorderWidth
                        el.style.borderStyle = this.addEditForm.btnCancelBorderStyle
                        el.style.borderColor = this.addEditForm.btnCancelBorderColor
                        el.style.borderRadius = this.addEditForm.btnCancelBorderRadius
                        el.style.backgroundColor = this.addEditForm.btnCancelBgColor
                    })
                })
            },
            addEditUploadStyleChange() {
                this.$nextTick(()=>{
                    document.querySelectorAll('.addEdit-block .upload .el-upload-list--picture-card .el-upload-list__item').forEach(el=>{
                        el.style.width = this.addEditForm.uploadHeight
                        el.style.height = this.addEditForm.uploadHeight
                        el.style.borderWidth = this.addEditForm.uploadBorderWidth
                        el.style.borderStyle = this.addEditForm.uploadBorderStyle
                        el.style.borderColor = this.addEditForm.uploadBorderColor
                        el.style.borderRadius = this.addEditForm.uploadBorderRadius
                        el.style.backgroundColor = this.addEditForm.uploadBgColor
                    })
                })
            },
        }
    };
</script>
<style lang="scss">
.editor{
  height: 500px;

  & /deep/ .ql-container {
	  height: 310px;
  }
}
.amap-wrapper {
  width: 100%;
  height: 500px;
}
.search-box {
  position: absolute;
}
.addEdit-block {
	margin: -10px;
}
.detail-form-content {
	padding: 12px;
	background-color: transparent;
}
.btn .el-button {
  padding: 0;
}</style>

