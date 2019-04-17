/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/6/9 13:43:17                            */
/*==============================================================*/


drop table if exists role;

drop table if exists accessrule;

drop table if exists account;

drop table if exists applyinfoofcom;

drop table if exists assetinfo;

drop table if exists chanproduct;

drop table if exists codeofpoints;

drop table if exists codetable;

drop table if exists comdiligence;

drop table if exists consult;

drop table if exists creditinfoofcom;

drop table if exists creditrecode;

drop table if exists custinfo;

drop table if exists custscore;

drop table if exists debtinfo;

drop table if exists deliapplicateinfo;

drop table if exists delimortgage;

drop table if exists doctask;

drop table if exists exceptloaninfo;

drop table if exists grantapproval;

drop table if exists houseassess;

drop table if exists image;

drop table if exists incomeinfo;

drop table if exists incomeofcom;

drop table if exists litigationinfo;

drop table if exists liveinfo;

drop table if exists loanprecondition;

drop table if exists log;

drop table if exists mattersattention;

drop table if exists mediainquiry;

drop table if exists menu;

drop table if exists mortgage;

drop table if exists mortgagefiling;

drop table if exists mortgagescore;

drop table if exists msgadditional;

drop table if exists msgmaininfo;

drop table if exists msgtemplate;

drop table if exists nodebutton;

drop table if exists nodepage;

drop table if exists noderole;

drop table if exists noticeinfo;

drop table if exists organization;

drop table if exists otherapplyinfo;

drop table if exists overduefollow;

drop table if exists page;

drop table if exists paymentapplyinfo;

drop table if exists person;

drop table if exists postloaninfo;

drop table if exists processappinfo;

drop table if exists procloantype;

drop table if exists procnodefile;

drop table if exists product;

drop table if exists productarea;

drop table if exists productnode;

drop table if exists profiles;

drop table if exists prorepaytype;

drop table if exists ratescore;

drop table if exists repayfollow;

drop table if exists repayinfo;

drop table if exists repayplan;

drop table if exists repaytoinfo;

drop table if exists reservations;

drop table if exists rolemenu;

drop table if exists scoreresult;

drop table if exists sertalno;

drop table if exists sysparameter;

drop table if exists transaction;

drop table if exists userrole;

drop table if exists workhistory;

drop table if exists workitem;

drop table if exists workproc;

/*==============================================================*/
/* Table: role                                                  */
/*==============================================================*/
create table role
(
   roleid               varchar(4) not null comment '角色编号',
   rolename             varchar(80) comment '角色名称',
   chgdt                datetime comment '最后修改时间',
   chgtl                varchar(8) comment '最后修改人',
   primary key (roleid)
);

alter table role comment '角色表';

/*==============================================================*/
/* Table: accessrule                                            */
/*==============================================================*/
create table accessrule
(
   id                   varchar(19) not null comment '主键id',
   productno            varchar(6) comment '产品码',
   expression           varchar(120) comment '表达式',
   admittancetype       char(1) comment '准入类型',
   isattention          char(1) comment '命中时是否尽调注意事项',
   isworkidtice         char(1) comment '命中时是否审批注意事项',
   remark               varchar(200) comment '备注',
   primary key (id)
);

alter table accessrule comment '产品规则表';

/*==============================================================*/
/* Table: account                                               */
/*==============================================================*/
create table account
(
   accountno            varchar(19) comment '账户号码',
   accountname          varchar(80) not null comment '账户名称',
   accountorg           varchar(5) comment '账户所属机构',
   accountbakno         varchar(80) comment '账户开户银行',
   accountremian        decimal(17,5) comment '账户余额',
   accounttype          varchar(2) comment '账户类型',
   balanceaccountflg    char(1) comment '是否默认结算账户',
   permitchangeorg      varchar(5) comment '账户变更权限机构',
   bailamount           decimal(17,5) comment '保证金金额',
   freezeamount         decimal(17,5) comment '冻结保证金金额',
   lenders              decimal(17,5) comment '放款额度',
   usefullimit          decimal(17,5) comment '可用额度',
   loanremian           decimal(17,5) comment '贷款余额',
   chgtl                varchar(8) comment '最后修改人',
   chgdt                datetime comment '最后修改时间',
   primary key (accountname)
);

alter table account comment '账户表';

/*==============================================================*/
/* Table: applyinfoofcom                                        */
/*==============================================================*/
create table applyinfoofcom
(
   custno               varchar(10) not null comment '客户编号',
   applyertype          varchar(2) comment '申请人类型',
   applymainbody        varchar(80) comment '申请主体',
   orgname              varchar(80) comment '企业名称',
   socialcreditcode     varchar(30) comment '统一社会信用代码',
   managetype           varchar(2) comment '经营类型',
   juridical            varchar(80) comment '法定代表人',
   comstartdate         datetime comment '公司成立日期',
   comenddate           datetime comment '营业期限至',
   registcapital        decimal(17,5) comment '注册资本',
   contricapital        decimal(17,5) comment '认缴资本',
   comaddress           varchar(200) comment '公司注册地址',
   realcomaddress       varchar(200) comment '公司实际经营地址',
   managearea           varchar(80) comment '经营范围',
   industry             varchar(2) comment '行业分类',
   shareholder          varchar(80) comment '股东信息',
   mianbusiness         varchar(80) comment '主要产品及业务',
   mainsupplier         varchar(80) comment '主要供应商',
   maincustomer         varchar(80) comment '主要客户',
   chgtl                varchar(8) comment '最后修改人',
   chgdt                datetime comment '最后修改时间',
   primary key (custno)
);

alter table applyinfoofcom comment '申请人信息表（公司）';

/*==============================================================*/
/* Table: assetinfo                                             */
/*==============================================================*/
create table assetinfo
(
   workid               varchar(10) not null comment '流水编号',
   assettype            varchar(10) comment '资产类型',
   address              varchar(200) comment '坐落地址',
   isprovidepaper       char(1) comment '是否提供产证',
   propertyowner        varchar(80) comment '产权人',
   housenature          varchar(20) comment '房产性质',
   housearea            varchar(4) comment '建筑面积',
   buytime              datetime comment '购买时间',
   buyprice             decimal(17,5) comment '购买价格',
   docchoosetype        varchar(10) comment '资料选择类别',
   assetsituation       varchar(200) comment '资产情况说明',
   chgtl                varchar(8) comment '最后修改人',
   chgdt                datetime comment '最后修改时间',
   primary key (workid)
);

alter table assetinfo comment '资产信息表';

/*==============================================================*/
/* Table: chanproduct                                           */
/*==============================================================*/
create table chanproduct
(
   id                   varchar(19) not null comment '主键id',
   organizationno       varchar(5) comment '机构编号',
   productno            varchar(6) comment '产品编号',
   primary key (id)
);

alter table chanproduct comment '渠道-产品表';

/*==============================================================*/
/* Table: codeofpoints                                          */
/*==============================================================*/
create table codeofpoints
(
   id                   varchar(19) not null comment '主键id',
   columnname           varchar(20) comment '字段名称',
   scoringrubrics       varchar(40) comment '评分指标',
   grade                decimal(5,2) comment '分数',
   chgtl                varchar(8) comment '最后修改人',
   chgdt                datetime comment '最后修改时间',
   primary key (id)
);

alter table codeofpoints comment '评分规则表';

/*==============================================================*/
/* Table: codetable                                             */
/*==============================================================*/
create table codetable
(
   codtyp               varchar(20) not null comment '码表类型',
   codflg               varchar(20) not null comment '码表标识',
   coddes               varchar(100) comment '码表中文内容',
   idx                  decimal(8) comment '顺序',
   removeflg            char(1) comment '是否移除标志',
   chgtl                varchar(8) comment '修改人',
   chgdt                datetime comment '修改时间',
   descriptions         varchar(40) comment '描述',
   primary key (codtyp, codflg)
);

alter table codetable comment '码表';

/*==============================================================*/
/* Table: comdiligence                                          */
/*==============================================================*/
create table comdiligence
(
   workid               varchar(10) not null comment '申请编号',
   companytype          varchar(2) comment '公司经营类型',
   comemployee          varchar(80) comment '公司从业人员',
   combackground        longtext comment '公司背景介绍',
   comsituation         varchar(80) comment '工厂情况',
   chgdt                datetime comment '最后修改时间',
   chgtl                varchar(8) comment '最后修改人',
   primary key (workid)
);

alter table comdiligence comment '公司尽调信息表';

/*==============================================================*/
/* Table: consult                                               */
/*==============================================================*/
create table consult
(
   id                   varchar(19) not null comment '主键id',
   consultman           varchar(80) comment '查档人',
   workid               varchar(10) comment '流水编号',
   mortgageno           varchar(19) comment '抵押物编号',
   consultresult        varchar(10) comment '查档结果',
   consultstate         varchar(10) comment '查档状态',
   consultdate          datetime comment '查档日期',
   primary key (id)
);

alter table consult comment '查档表';

/*==============================================================*/
/* Table: creditinfoofcom                                       */
/*==============================================================*/
create table creditinfoofcom
(
   workid               varchar(10) not null comment '申请编号',
   comcreditdate        datetime comment '企业信用报告日期',
   isblackofcredit      char(1) comment '企业信用报告记录是否空白',
   chgtl                varchar(8) comment '最后修改人',
   chgdt                datetime comment '最后修改时间',
   primary key (workid)
);

alter table creditinfoofcom comment '信用记录表（公司）';

/*==============================================================*/
/* Table: creditrecode                                          */
/*==============================================================*/
create table creditrecode
(
   workid               varchar(10) not null comment '流水编号',
   creditreportdate     datetime comment '征信报告日期',
   isblackofloancredit  char(1) comment '贷款征信记录是否空白',
   isblackofcreditcard  char(1) comment '信用卡征信记录是否空白',
   iswarnofcredit       char(1) comment '信用记录是否包含止付、冻结、呆账',
   isoverdue            char(1) comment '当前是否逾期',
   isrecentoverdue      char(1) comment '近24个月内是否有逾期记录',
   chgtl                varchar(8) comment '操作人',
   chgdt                datetime comment '操作时间',
   primary key (workid)
);

alter table creditrecode comment '信用记录表';

/*==============================================================*/
/* Table: custinfo                                              */
/*==============================================================*/
create table custinfo
(
   workid               varchar(10) not null comment '贷款流水号',
   custno               varchar(10) comment '客户编号',
   custtype             varchar(4) comment '客户类型',
   custname             varchar(80) comment '客户姓名',
   sex                  varchar(1) comment '性别',
   cerdid               varchar(32) comment '身份证号',
   birthday             datetime comment '出生年月',
   telnumber            varchar(20) comment '电话号码',
   familyaddress        varchar(300) comment '家庭住址',
   age                  varchar(4) comment '年龄',
   censusregister       varchar(120) comment '户籍',
   maritalstatus        char(1) comment '婚姻状况',
   islitigation         varchar(1) comment '是否有诉讼记录',
   job                  varchar(80) comment '职业',
   chgdt                datetime comment '操作时间',
   chgtl                varchar(8) comment '操作人',
   primary key (workid)
);

alter table custinfo comment '申请人信息表';

/*==============================================================*/
/* Table: custscore                                             */
/*==============================================================*/
create table custscore
(
   id                   varchar(19) not null comment '主键id',
   startcustgrade       varchar(4) comment '开始客户评分分数',
   endcustgrade         varchar(4) comment '结束客户评分分数',
   custleavel           char(1) comment '客户评分等级',
   primary key (id)
);

alter table custscore comment '客户评分表';

/*==============================================================*/
/* Table: debtinfo                                              */
/*==============================================================*/
create table debtinfo
(
   workid               varchar(10) not null comment '流水编号',
   debttype             varchar(12) comment '负债类型',
   borrowman            varchar(80) comment '借款人',
   fananceorg           varchar(80) comment '金融机构',
   totalloan            decimal(17,5) comment '借款总额',
   borrowremain         decimal(17,5) comment '借款余额',
   startdate            datetime comment '开始日期',
   enddate              datetime comment '结束日期',
   pledgeno             varchar(80) comment '抵押物产权编号',
   pledgeaddress        varchar(120) comment '抵押物坐落地址',
   usefulposition       decimal(17,5) comment '可用额度',
   usedposition         decimal(17,5) comment '已用额度',
   conversion           decimal(8,5) comment '折算比例',
   chgdt                datetime comment '最后修改时间',
   chgtl                varchar(8) comment '最后修改人',
   primary key (workid)
);

alter table debtinfo comment '负债信息表';

/*==============================================================*/
/* Table: deliapplicateinfo                                     */
/*==============================================================*/
create table deliapplicateinfo
(
   id                   varchar(19) not null comment '主键ID',
   workid               varchar(10) comment '流水编号',
   borrower             varchar(80) comment '借款人名称',
   relationcustno       varchar(10) comment '关联客户编号',
   cerdid               varchar(32) comment '借款人身份证号',
   isserioussick        char(1) comment '借款人是否有重大疾病',
   isbadhabbit          char(1) comment '借款人是否有赌博、吸毒、涉黑、诈骗等不良嗜好',
   iscriminalrecord     char(1) comment '借款人是否存在历史犯罪记录',
   isdivorce            char(1) comment '是否存在离婚协议未明确本抵押物的分配',
   isunmarried          char(1) comment '是否为未婚或单身情形，需核实婚姻状况',
   isshammarriage       char(1) comment '是否存在“假离婚”分割财产，逃避债务的嫌疑',
   isdubiousmarriage    char(1) comment '为规避夫妻做共同借款人，是否存在可疑的婚姻证明',
   reasonofoverdue      varchar(300) comment '了解当前逾期原因',
   badinforeason        varchar(300) comment '了解冻结、止付、呆滞、代偿等不良信息的原因',
   isunableproven       char(1) comment '是否存在客户口述已结案，但无法提供结案证明及付款凭证',
   isfalsecase          char(1) comment '是否存在涉及诉讼已提供结案证明，但经网站查询仍处于被执行状态',
   isunfulfilleddebt    char(1) comment '是否存在原告撤诉或法律判决被告分期偿还，实则被告债务未履行',
   isenforcedlitigation char(1) comment '产权人无诉讼其直系亲属（含前配偶）或控股公司有被执行诉讼',
   iskeepoutjob         char(1) comment '是否属于公、检、法、军人、同行等禁入职业',
   isprudentindustry    char(1) comment '是否涉及地产、民间金融、钢贸等谨慎行业',
   ishignriskbehavior   char(1) comment '借款用途是否涉及炒房、炒股、民间借贷等高风险行为',
   chgdt                datetime comment '最后修改时间',
   chgtl                varchar(8) comment '最后修改人',
   primary key (id)
);

alter table deliapplicateinfo comment '尽调申请人信息表';

/*==============================================================*/
/* Table: delimortgage                                          */
/*==============================================================*/
create table delimortgage
(
   id                   varchar(19) not null comment '主键ID',
   workid               varchar(10) comment '流水编号',
   isbasement           char(1) comment '是否有地下室',
   housestate           varchar(12) comment '房产状态',
   follorpurpose        varchar(80) comment '土地用途',
   ismaritalproperty    char(1) comment '是否为婚内财产',
   floors               varchar(4) comment '总层数',
   numberoflayers       varchar(4) comment '所在层数',
   degreedecoration     varchar(30) comment '装修程度',
   houseorientation     varchar(30) comment '房屋朝向',
   buildingstructure    varchar(30) comment '房屋结构',
   buildingtype         varchar(30) comment '建筑类型',
   buyhousedate         char(1) comment '购房日期',
   isrentout            char(1) comment '是否出租',
   iselevatorroom       char(1) comment '是否为电梯房',
   issubwaynaer         char(1) comment '300米内是否有地铁',
   ishospitalnear       char(1) comment '周边是否配备大型医院',
   isschoolnear         char(1) comment '周边是否配备公立学校',
   issupermarketnear    char(1) comment '周边是否配备大型超市',
   issoleresidence      char(1) comment '抵押物是否为唯一住宅',
   historyrate          decimal(17,5) comment '历史成交价',
   buyerfasttransprice  decimal(17,5) comment '当前快速成交价（买方）',
   sellersfasttransprice decimal(17,5) comment '当前快速成交价（卖方）',
   hangingprice         decimal(17,5) comment '经纪网站挂盘价',
   currenthangingprice  decimal(17,5) comment '当前挂盘价',
   houseunitprice       decimal(17,5) comment '房产评估单价',
   housetotalprice      decimal(17,5) comment '房产评估总价',
   isjudgenotclearly    char(1) comment '产权证描述对于抵押物性质判定是否不清晰',
   issalelimit          char(1) comment '是否属于指定销售特定人员房产',
   isnotsameofhouse     char(1) comment '实地勘查抵押物小区名称、地址是否和产权证不一致',
   isselfreform         char(1) comment '是否存在私自改建、违建等情形',
   isproblemcase        char(1) comment '是否有催收函、律师函、门锁被撬、监控等情形',
   issinglebuilding     char(1) comment '是否为独栋无社区的楼盘',
   isnotsameofowner     char(1) comment '是否存在被面谈人与产权人不一致或为代持物业',
   isgeneration         char(1) comment '是否有代持嫌疑',
   isbadactionperson    char(1) comment '是否有残疾、瘫痪和行动不便等人士居住',
   isnotsameoffamilyinfo char(1) comment '生活痕迹是否与婚育状况不一致',
   istenantbiggerdatedue char(1) comment '是否承租期大于贷款到期日',
   isimportdefects      char(1) comment '询价中是否发现本抵押物的重要缺陷（如凶宅',
   islistingsale        char(1) comment '询价中是否存在本抵押物正在挂牌销售',
   longtimenorecord     char(1) comment '抵押房产是否长期（6个月以上）无成交记录',
   mortgageview         longtext comment '抵押物尽调意见',
   comments             longtext comment '特别注意事项尽调意见',
   chgdt                datetime comment '最后修改时间',
   chgtl                varchar(8) comment '最后修改人',
   primary key (id)
);

alter table delimortgage comment '尽调抵押物信息表';

/*==============================================================*/
/* Table: doctask                                               */
/*==============================================================*/
create table doctask
(
   workid               varchar(10) not null comment '流水编号',
   relationworkid       varchar(10) comment '关联流水编号',
   custno               varchar(10) comment '客户编号',
   channo               varchar(6) comment '渠道编号',
   fundpartyno          varchar(6) comment '资金方编号',
   state                varchar(12) comment '状态',
   productno            varchar(6) comment '产品编号',
   applydate            datetime comment '申请日期',
   userid               varchar(8) comment '所属用户',
   type                 varchar(12) comment '流水类型',
   handleflg            char(1) comment '处理标识',
   chgtl                varchar(8) comment '最后修改人',
   chgdt                datetime comment '最后修改时间',
   primary key (workid)
);

alter table doctask comment '流水表';

/*==============================================================*/
/* Table: exceptloaninfo                                        */
/*==============================================================*/
create table exceptloaninfo
(
   workid               varchar(10) not null comment '流水编号',
   expectapplyamount    decimal(17,5) comment '期待贷款金额',
   expectapplyrate      decimal(8,5) comment '期望申请利率',
   expectapplyyear      varchar(4) comment '期望申请年限',
   repaymethod          varchar(20) comment '还款方式',
   chgtl                varchar(8) comment '最后修改人',
   chgdt                datetime comment '最后修改时间',
   primary key (workid)
);

alter table exceptloaninfo comment '期待贷款信息表';

/*==============================================================*/
/* Table: grantapproval                                         */
/*==============================================================*/
create table grantapproval
(
   id                   varchar(19) not null,
   workid               varchar(10),
   loanconfirmflg       char(1),
   contractsignflg      char(1),
   declaresignflg       char(1),
   mortgagestate        varchar(4),
   approvelcarryoutflg  char(1),
   suggestloanflg       char(1),
   realestatecollectflg char(1),
   resultcollectflg     char(1),
   referenceflg         char(1),
   sharepledgeflg       char(1),
   bailcollectflg       char(1),
   preloanapplyflg      char(1),
   repayplanflg         char(1),
   feeamount            decimal(17,5),
   loanapproveltype     varchar(8),
   loanapprovelview     longtext,
   approver             varchar(8),
   approvelopinion      longtext,
   primary key (id)
);

alter table grantapproval comment '放款审批表';

/*==============================================================*/
/* Table: houseassess                                           */
/*==============================================================*/
create table houseassess
(
   workid               varchar(10) not null comment '流水编号',
   assessprice          decimal(17,5) comment '评估单价',
   assesstotal          decimal(17,5) comment '评估总价',
   transunitprice       decimal(17,5) comment '成交单价',
   totaltransprice      decimal(17,5) comment '成交总价',
   chgdt                datetime comment '修改日期',
   chgtl                varchar(8) comment '修改人',
   primary key (workid)
);

alter table houseassess comment '房产评估表';

/*==============================================================*/
/* Table: image                                                 */
/*==============================================================*/
create table image
(
   imageid              varchar(19) not null comment '主键ID',
   imagetype            varchar(4) comment '影像类型',
   imagename            varchar(120) comment '影像名称',
   rootdir              varchar(80) comment '保存跟路径',
   absolutedir          varchar(240) comment '保存相对路径',
   workid               varchar(10) comment '流水号',
   savetype             varchar(10) comment '保存类型',
   saveaddress          varchar(200) comment '存放地',
   chgdt                datetime comment '操作时间',
   chgtl                varchar(8) comment '操作人',
   primary key (imageid)
);

alter table image comment '影像表';

/*==============================================================*/
/* Table: incomeinfo                                            */
/*==============================================================*/
create table incomeinfo
(
   workid               varchar(10) not null comment '流水编号',
   receipts             varchar(30) comment '收入进项',
   bnkno                varchar(80) comment '所属银行',
   bnkcard              varchar(4) comment '银行账号',
   iscover              char(1) comment '是否覆盖',
   halfyearreceipt      varchar(30) comment '近半年月进账项',
   halfyaerincome       decimal(17,5) comment '近半年月收入总额',
   rentincome           decimal(17,5) comment '月租金收入',
   chgtl                varchar(8) comment '最后修改人',
   chgdt                datetime comment '最后修改时间',
   primary key (workid)
);

alter table incomeinfo comment '收入情况表';

/*==============================================================*/
/* Table: incomeofcom                                           */
/*==============================================================*/
create table incomeofcom
(
   workid               varchar(10) not null comment '申请编号',
   bankstream           decimal(17,5) comment '银行流水',
   paydutyapplyinfo     varchar(80) comment '增值税纳税申报表',
   otherincome          varchar(200) comment '其他收入证明',
   incomeexplain        varchar(200) comment '其他收入证明',
   chgtl                varchar(8) comment '最后修改人',
   chgdt                datetime comment '最后修改时间',
   primary key (workid)
);

alter table incomeofcom comment '收入情况表（公司）';

/*==============================================================*/
/* Table: litigationinfo                                        */
/*==============================================================*/
create table litigationinfo
(
   workid               varchar(10) not null comment '流水编号',
   isborrlitigation     char(1) comment '借款人是否有诉讼记录',
   iscomlitigation      char(1) comment '公司是否有诉讼记录',
   litigationstate      varchar(10) comment '诉讼状态',
   litigationtype       varchar(10) comment '诉讼类型',
   isdishonest          char(1) comment '是否是失信人',
   litigationexplain    varchar(300) comment '诉讼情况说明',
   chgdt                datetime comment '操作日期',
   chgtl                varchar(8) comment '操作人',
   primary key (workid)
);

alter table litigationinfo comment '诉讼信息表';

/*==============================================================*/
/* Table: liveinfo                                              */
/*==============================================================*/
create table liveinfo
(
   id                   varchar(19) not null comment '主键id',
   workid               varchar(10) comment '流水编号',
   liveperson           varchar(80) comment '直播人',
   monitor              varchar(80) comment '监控人',
   livestarttime        datetime comment '直播开始时间',
   liveendtime          datetime comment '直播结束时间',
   chgdt                datetime comment '最后修改时间',
   chgtl                varchar(8) comment '最后修改人',
   primary key (id)
);

alter table liveinfo comment '直播信息表';

/*==============================================================*/
/* Table: loanprecondition                                      */
/*==============================================================*/
create table loanprecondition
(
   loanpredocno         varchar(4) not null comment '放款前提资料编号',
   loanpredocname       varchar(80) comment '放款前提资料名称',
   productno            varchar(6) comment '产品编号',
   chgtl                varchar(8) comment '最后修改人',
   chgdt                datetime comment '最后修改时间',
   primary key (loanpredocno)
);

alter table loanprecondition comment '放款前提表';

/*==============================================================*/
/* Table: log                                                   */
/*==============================================================*/
create table log
(
   logid                varchar(19) not null comment '日志主键',
   type                 varchar(10) comment '类型',
   typevalue            varchar(40) comment '类型描述',
   descriptions         longtext comment '描述',
   checktl              varchar(8) comment '记录人',
   organizationno       varchar(5) comment '机构编号',
   departmentno         varchar(6) comment '部门编号',
   ref_logid            varchar(19),
   chgdt                datetime comment '最后修改日期',
   chgtl                varchar(8) comment '最后修改时间',
   primary key (logid)
);

alter table log comment '日志表';

/*==============================================================*/
/* Table: mattersattention                                      */
/*==============================================================*/
create table mattersattention
(
   id                   varchar(19) not null comment '注意事项编号',
   workid               varchar(10) comment '贷款流水号',
   notice1              longtext comment '尽调注意事项',
   notice2              longtext comment '审批注意事项',
   noticedate           datetime comment '提示日期',
   primary key (id)
);

alter table mattersattention comment '注意事项表';

/*==============================================================*/
/* Table: mediainquiry                                          */
/*==============================================================*/
create table mediainquiry
(
   id                   varchar(19) not null comment '询价编号',
   workid               varchar(10) comment '贷款流水号',
   agency               varchar(80) comment '中介名称',
   evalamt              decimal(17,5) comment '评估金额',
   evaltime             datetime comment '询价时间',
   primary key (id)
);

alter table mediainquiry comment '中介询价表';

/*==============================================================*/
/* Table: menu                                                  */
/*==============================================================*/
create table menu
(
   menuid               varchar(6) not null comment '菜单编号',
   menuname             varchar(30) comment '菜单名称',
   chgtl                varchar(8) comment '最后修改人',
   chgdt                datetime comment '最后修改时间',
   primary key (menuid)
);

alter table menu comment '菜单表';

/*==============================================================*/
/* Table: mortgage                                              */
/*==============================================================*/
create table mortgage
(
   id                   varchar(19) not null comment '抵押物编号',
   propertyowner        varchar(80) comment '产权人',
   houseaddress         varchar(300) comment '房屋坐落地址',
   martgagename         varchar(80) comment '抵押物名称',
   floorarea            varchar(4) comment '建筑面积',
   landuseage           varchar(4) comment '土地使用年限',
   mortgagefirsttype    varchar(30) comment '抵押物一级类型',
   mortgagesecondtype   varchar(30) comment '抵押物二级类型',
   landpurpose          varchar(30) comment '土地用途',
   housepurpose         varchar(20) comment '房屋用途',
   registrationdate     datetime comment '产权登记日期',
   housefinishdate      datetime comment '竣工日期',
   buyhousedate         datetime comment '购房日期',
   houseage             varchar(4) comment '楼龄',
   landproperty         varchar(16) comment '土地性质',
   houseproperty        varchar(12) comment '房屋性质',
   propertystate        char(1) comment '产权状态',
   workid               varchar(10) comment '流水编号',
   chgtl                varchar(8) comment '操作人',
   chgdt                datetime comment '操作时间',
   primary key (id)
);

alter table mortgage comment '抵押物信息表';

/*==============================================================*/
/* Table: mortgagefiling                                        */
/*==============================================================*/
create table mortgagefiling
(
   mortgagefilingid     varchar(19) not null comment '抵押物查档ID',
   workid               varchar(10) not null comment '流水编号',
   isnetsign            char(1) comment '抵押物是否有网签备案',
   ismortgageclose      varchar(2) comment '抵押物是否曾有查封',
   legaldispute         varchar(200) comment '扣押等法律纠纷记录',
   mortgagestate        varchar(10) comment '抵押物查档状态',
   mortgagecomorbank    varchar(120) comment '抵押物现抵押银行或公司',
   queriesofmonth       varchar(6) comment '抵押物单月查档人数',
   queriesoftotal       varchar(6) comment '抵押物查档次数',
   mortgages1           varchar(80) comment '抵押物顺位人一',
   mortgages2           varchar(80) comment '抵押物顺位人二',
   chgdt                datetime comment '最后修改时间',
   chgtl                varchar(8) comment '最后修改人',
   primary key (mortgagefilingid)
);

alter table mortgagefiling comment '抵押物查档表';

/*==============================================================*/
/* Table: mortgagescore                                         */
/*==============================================================*/
create table mortgagescore
(
   id                   varchar(19) not null comment '主键id',
   startmortgrade       varchar(4) comment '开始抵押物评分分数',
   endmortgrade         varchar(4) comment '结束抵押物评分分数',
   mortgagerate         decimal(9,6) comment '抵押率',
   primary key (id)
);

alter table mortgagescore comment '抵押物评分表';

/*==============================================================*/
/* Table: msgadditional                                         */
/*==============================================================*/
create table msgadditional
(
   id                   varchar(19) not null comment '消息编号',
   refid                varchar(19) comment '关联消息编号',
   evaltime             varchar(8) comment '接收人',
   state                varchar(1) comment '消息状态',
   primary key (id)
);

alter table msgadditional comment '消息附加表';

/*==============================================================*/
/* Table: msgmaininfo                                           */
/*==============================================================*/
create table msgmaininfo
(
   id                   varchar(19) not null comment '消息编号',
   workid               varchar(10) comment '贷款流水号',
   content              longtext comment '内容',
   senduser             varchar(8) comment '发送人',
   recuser              varchar(8) comment '接收人',
   primary key (id)
);

alter table msgmaininfo comment '消息主表';

/*==============================================================*/
/* Table: msgtemplate                                           */
/*==============================================================*/
create table msgtemplate
(
   templateno           varchar(6) not null comment '模板编号',
   templatecontent      varchar(300) comment '模板内容',
   templatename         varchar(80) comment '模板名称',
   noticetype           varchar(10) comment '提醒方式',
   templatetype         varchar(10) comment '模板类型',
   removeflg            char(1) comment '是否生效标志',
   chgtl                varchar(8) comment '最后修改人',
   chgdt                datetime comment '最后修改时间',
   primary key (templateno)
);

alter table msgtemplate comment '短信模板表';

/*==============================================================*/
/* Table: nodebutton                                            */
/*==============================================================*/
create table nodebutton
(
   id                   varchar(19) not null comment '主键id',
   buttonname           varchar(80) comment '按钮名称',
   redirectnode         varchar(4) comment '跳转节点',
   chgtl                varchar(8) comment '最后修改人',
   chgdt                datetime comment '最后修改日期',
   primary key (id)
);

alter table nodebutton comment '节点按钮表';

/*==============================================================*/
/* Table: nodepage                                              */
/*==============================================================*/
create table nodepage
(
   id                   char(10) not null comment 'id',
   productno            char(10) comment '产品编号',
   nodeid               char(10) comment '节点',
   pageid               char(10) comment '页面',
   editflg              char(10) comment '是否可编辑',
   viewflg              char(10) comment '是否可查看',
   chgtl                char(10) comment '最后修改人',
   chgdt                char(10) comment '最后修改时间',
   primary key (id)
);

alter table nodepage comment '节点页面表';

/*==============================================================*/
/* Table: noderole                                              */
/*==============================================================*/
create table noderole
(
   id                   varchar(19) not null comment 'id',
   productno            varchar(6) comment '产品编号',
   nodeid               varchar(4) comment '节点',
   redirecttype         varchar(16) comment '跳转类型',
   lastnode             varchar(4) comment '上一节点',
   entercondition       varchar(120) comment '进入条件',
   nodetime             varchar(4) comment '节点时限',
   roleid               varchar(4) comment '角色',
   chgdt                varchar(8) comment '最后修改人',
   chgtl                datetime comment '最后修改时间',
   primary key (id)
);

alter table noderole comment '角色权限表';

/*==============================================================*/
/* Table: noticeinfo                                            */
/*==============================================================*/
create table noticeinfo
(
   id                   varchar(19) not null comment '主键id',
   noticetitle          varchar(40) comment '公告标题',
   noticecontent        longtext comment '公告内容',
   issuer               varchar(80) comment '发布人',
   newstime             datetime comment '发布时间',
   chgtl                varchar(80) comment '最后修改人',
   chgdt                datetime comment '最后修改时间',
   primary key (id)
);

alter table noticeinfo comment '公告信息表';

/*==============================================================*/
/* Table: organization                                          */
/*==============================================================*/
create table organization
(
   organizationno       varchar(6) not null comment '机构编号',
   organizationname     varchar(60) comment '机构名称',
   description          longtext comment '机构描述',
   orgbelongsto         varchar(16) comment '机构所属',
   linkman              varchar(80) comment '联系人',
   telnumber            varchar(20) comment '联系电话',
   address              varchar(200) comment '办公地址',
   organizationcode     char(1) comment '机构代码',
   orgleavel            char(1) comment '机构级别',
   chgdt                datetime comment '最后修改时间',
   chgtl                varchar(8) comment '最后修改人',
   primary key (organizationno)
);

alter table organization comment '机构表';

/*==============================================================*/
/* Table: otherapplyinfo                                        */
/*==============================================================*/
create table otherapplyinfo
(
   workid               varchar(10) not null comment '流水编号',
   usageofloan          varchar(4) comment '借款用途说明',
   usageloanplan        varchar(200) comment '用款计划说明',
   repaysource          varchar(4) comment '还款来源说明',
   repayplan            varchar(200) comment '还款计划说明',
   chgtl                varchar(8) comment '最后修改人',
   chgdt                datetime comment '最后修改时间',
   primary key (workid)
);

alter table otherapplyinfo comment '其他申请信息';

/*==============================================================*/
/* Table: overduefollow                                         */
/*==============================================================*/
create table overduefollow
(
   id                   varchar(19) not null comment '主键id',
   followman            varchar(8) comment '跟进人',
   workid               varchar(10) comment '流水编号',
   followcontent        longtext comment '跟进内容',
   overduecust          varchar(80) comment '逾期客户',
   overdueamount        decimal(17,5) comment '逾期金额',
   overdueday           varchar(4) comment '逾期天数',
   followdate           datetime comment '跟进日期',
   primary key (id)
);

alter table overduefollow comment '逾期跟进表';

/*==============================================================*/
/* Table: page                                                  */
/*==============================================================*/
create table page
(
   pageid               varchar(4) not null comment '页面编号',
   pagename             varchar(40) comment '页面名称',
   chgtl                varchar(8) comment '最后修改人',
   chgdt                datetime comment '最后修改时间',
   primary key (pageid)
);

alter table page comment '页面表';

/*==============================================================*/
/* Table: paymentapplyinfo                                      */
/*==============================================================*/
create table paymentapplyinfo
(
   workid               varchar(10) comment '申请编号',
   contractno           varchar(40) comment '合同编号',
   applicationtime      datetime comment '出款申请时间',
   purductno            varchar(6) comment '贷款产品',
   borrowername         varchar(80) comment '借款人姓名',
   custcerdid           varchar(32) comment '借款人身份证',
   custtelnumber        varchar(20) comment '借款人电话号码',
   loanamount           decimal(17,5) not null comment '借款金额',
   interestrate         decimal(9,6) comment '年化利率',
   monthrepayamount     decimal(17,5) comment '月还款金额',
   lifeofloan           varchar(4) comment '借款期限',
   repaymethod          varchar(40) comment '还款方式',
   examinationfee       decimal(17,5) comment '审查费',
   examinationrate      decimal(9,6) comment '担保费利率',
   guaranteefee         decimal(17,5) comment '担保费金额',
   totalfee             decimal(17,5) comment '出库前应收费用合计',
   fundamountname       varchar(80) comment '打\划款账户名',
   fundamount           varchar(19) comment '打\划款账号',
   fundbank             varchar(80) comment '打\划款开户行',
   chgdt                datetime comment '最后修改时间',
   chgtl                varchar(8) comment '最后修改人',
   primary key (loanamount)
);

alter table paymentapplyinfo comment '出款申请表';

/*==============================================================*/
/* Table: person                                                */
/*==============================================================*/
create table person
(
   workerid             varchar(8) not null comment '用户编号',
   workername           varchar(80) comment '用户名称',
   password             varchar(80) comment '密码',
   department           varchar(6) comment '所属部门',
   state                varchar(4) comment '状态',
   organizationid       varchar(6) comment '所属机构',
   telnumber            varchar(20) comment '电话号码',
   mobilephone          varchar(11) comment '手机号码',
   chgdt                datetime comment '最后修改日期',
   chgtl                varchar(8) comment '最后修改人',
   primary key (workerid)
);

alter table person comment '用户表';

/*==============================================================*/
/* Table: postloaninfo                                          */
/*==============================================================*/
create table postloaninfo
(
   workid               varchar(10) not null comment '流水编号',
   repaydateofmonth     char(1) comment '每月还款日',
   loanbalance          decimal(17,5) comment '贷款余额',
   accountstate         varchar(10) comment '账户状态',
   remainamount         decimal(17,5) comment '剩下放款金额',
   overdueflg           char(1) comment '逾期标识',
   overdueterm          varchar(6) comment '逾期期数',
   overduecorpus        decimal(17,5) comment '逾期本金',
   overdueaccrual       decimal(17,5) comment '逾期利息',
   defaultinterest      decimal(17,5) comment '罚息',
   nextrepaydate        datetime comment '下次还款日',
   primary key (workid)
);

alter table postloaninfo comment '贷后信息表';

/*==============================================================*/
/* Table: processappinfo                                        */
/*==============================================================*/
create table processappinfo
(
   id                   varchar(19) not null comment '主键id',
   workid               varchar(10) comment '流水编号',
   loanchangeflg        char(1) comment '贷款信息是否修改',
   agreeloanflg         char(1) comment '是否同意期望贷款申请信息',
   applyamount          decimal(17,5) comment '申请金额',
   applyrate            decimal(9,6) comment '申请利率',
   yearofapply          varchar(4) comment '申请年限',
   repaymethod          varchar(32) comment '还款方式',
   checkresult          varchar(16) comment '核实结果',
   checkview            longtext comment '核实意见',
   approvetype          varchar(16) comment '审批类型',
   approveview          longtext comment '审批意见',
   additionalinfo       varchar(200) comment '待补充资料',
   approveperson        varchar(8) comment '审批人',
   approvetime          datetime comment '审批时间',
   primary key (id)
);

alter table processappinfo comment '流程审批信息表';

/*==============================================================*/
/* Table: procloantype                                          */
/*==============================================================*/
create table procloantype
(
   id                   varchar(19) not null comment '主键id',
   productno            varchar(6) comment '产品编号',
   termofloan           varchar(32) comment '放款条件',
   subloanflg           char(1) comment '分次放款标识',
   firstloanratio       decimal(9,6) comment '首次放款比例',
   chgtl                varchar(8) comment '最后修改人',
   chgdt                datetime comment '最后修改时间',
   primary key (id)
);

alter table procloantype comment '产品放款类型表';

/*==============================================================*/
/* Table: procnodefile                                          */
/*==============================================================*/
create table procnodefile
(
   id                   varchar(19) not null comment '主键id',
   nodeid               varchar(4) comment '节点编号',
   fileno               varchar(4) comment '档案编号',
   chgtl                varchar(8) comment '最后修改人',
   chgdt                datetime comment '最后修改时间',
   primary key (id)
);

alter table procnodefile comment '流程节点档案资料表';

/*==============================================================*/
/* Table: product                                               */
/*==============================================================*/
create table product
(
   productno            varchar(6) not null comment '产品编号',
   productname          varchar(80) comment '产品名称',
   description          varchar(800) comment '产品描述',
   organizationno       varchar(5) comment '产品所属机构',
   minloanamount        decimal(17,5) comment '产品最低贷款金额',
   maxloanamount        decimal(17,5) comment '产品最高贷款金额',
   ratetype             varchar(20) comment '利率类型',
   minrateofyear        decimal(9,6) comment '最低利率（年）',
   maxrateofyear        decimal(9,6) comment '最高利率（年）',
   subsidyorg           varchar(5) comment '兜底机构',
   docmanageorg         varchar(5) comment '档案管理机构',
   buttmode             varchar(16) comment '资金方对接方式',
   duediligenceflg      char(1) comment '是否需要尽调直播',
   mortgagetype         varchar(16) comment '抵押办理方式',
   trustchannelflg      char(1) comment '是否使用信托通道',
   trustcheckmodel      varchar(16) comment '信托审批模式',
   takeeffectflg        char(1) comment '是否生效',
   permitchandueflg     char(1) comment '是否允许渠道尽调',
   permitfunddueflg     char(1) comment '是否允许资金方尽调',
   permitplaformdueflg  char(1) comment '是否允许平台尽调',
   duesystemflg         char(1) comment '尽调是否系统对接',
   riskapprovelpass     varchar(40) comment '风控审批通道',
   grantapprovelpass    varchar(40) comment '放款审批通道',
   issysriskapprovel    char(1) comment '通道风控审批是否系统对接',
   issysgrantapprovel   char(1) comment '通道放款审批是否系统对接',
   permitplaformmortflg char(1) comment '是否允许平台抵押办理',
   permitchanmortflg    char(1) comment '是否允许渠道抵押办理',
   permitfundmortflg    char(1) comment '是否允许资金方抵押办理',
   outloandocmanager    varchar(5) comment '出款要件管理机构',
   receivedocmanager    varchar(5) comment '回款要件管理机构',
   chgtl                varchar(8) comment '最后修改人',
   chgdt                datetime comment '最后修改时间',
   checkfrequency       varchar(10) comment '查档频率',
   companydiligenceflg  char(1) comment '是否进行经营场所尽调',
   primary key (productno)
);

alter table product comment '产品表';

/*==============================================================*/
/* Table: productarea                                           */
/*==============================================================*/
create table productarea
(
   id                   varchar(19) not null comment '主键id',
   productno            varchar(6) comment '产品编号',
   areaname             varchar(80) comment '区域名称',
   city                 varchar(80) comment '所在城市',
   agentclass           char(1) comment '代理级别',
   islimitsale          char(1) comment '是否限售',
   areaweight           decimal(5,2) comment '区域权重',
   limitsaleyear        varchar(4) comment '限售年限（年）',
   chgtl                varchar(8) comment '最后修改人',
   chgdt                datetime comment '最后修改时间',
   primary key (id)
);

alter table productarea comment '区域表';

/*==============================================================*/
/* Table: productnode                                           */
/*==============================================================*/
create table productnode
(
   nodeid               varchar(4) not null comment '节点编号',
   nodename             varchar(80) comment '节点名称',
   productno            varchar(6) comment '产品编号',
   hgtl                 varchar(8) comment '最后修改人',
   chgdt                datetime comment '最后修改时间',
   primary key (nodeid)
);

alter table productnode comment '产品节点表';

/*==============================================================*/
/* Table: profiles                                              */
/*==============================================================*/
create table profiles
(
   fileno               varchar(4) not null comment '档案编号',
   filename             varchar(80) comment '档案名称',
   chgtl                varchar(8) comment '最后修改人',
   chgdt                datetime comment '最后修改时间',
   filetype             varchar(4) comment '档案类型',
   state                varchar(4) comment '状态',
   primary key (fileno)
);

alter table profiles comment '档案资料表';

/*==============================================================*/
/* Table: prorepaytype                                          */
/*==============================================================*/
create table prorepaytype
(
   id                   varchar(19) not null comment '主键id',
   productno            varchar(6) comment '产品编号',
   repaytype            varchar(32) comment '还款方式',
   chgtl                varchar(8) comment '最后修改人',
   chgdt                datetime comment '最后修改时间',
   primary key (id)
);

alter table prorepaytype comment '产品还款方式表';

/*==============================================================*/
/* Table: ratescore                                             */
/*==============================================================*/
create table ratescore
(
   id                   varchar(19) not null comment '主键id',
   startrategrade       varchar(4) comment '开始利率评分分数',
   endrategrade         varchar(4) comment '结束利率评分分数',
   rate                 decimal(9,6) comment '利率',
   primary key (id)
);

alter table ratescore comment '利率评分表';

/*==============================================================*/
/* Table: repayfollow                                           */
/*==============================================================*/
create table repayfollow
(
   id                   varchar(19) not null comment '主键id',
   followman            varchar(8) comment '跟进人',
   workid               varchar(8) comment '流水编号',
   custno               varchar(10) comment '还款客户',
   repaydate            datetime comment '还款日期',
   followcontent        longtext comment '跟进内容',
   repayamount          decimal(17,5) comment '还款金额',
   followdate           datetime comment '跟进日期',
   primary key (id)
);

alter table repayfollow comment '还款跟进表';

/*==============================================================*/
/* Table: repayinfo                                             */
/*==============================================================*/
create table repayinfo
(
   id                   varchar(19) not null comment '主键id',
   workid               varchar(10) comment '申请编号',
   repayamount          decimal(17,5) comment '还款金额',
   repaytype            varchar(32) comment '还款方式',
   repayperson          varchar(80) comment '还款人',
   repayaccount         varchar(19) comment '还款账号',
   repaybank            varchar(80) comment '还款账户银行',
   repaytime            datetime comment '还款日期',
   payee                varchar(80) comment '收款人',
   accountnumber        varchar(19) comment '收款账号',
   chgdt                datetime comment '最后修改时间',
   chgtl                varchar(8) comment '最后修改人',
   primary key (id)
);

alter table repayinfo comment '还款表';

/*==============================================================*/
/* Table: repayplan                                             */
/*==============================================================*/
create table repayplan
(
   id                   varchar(19) not null comment '主键id',
   workid               varchar(10) comment '申请编号',
   repaydate            datetime comment '应还款日期',
   repayamount          decimal(17,5) comment '应还款金额',
   repaycapital         decimal(17,5) comment '应还款本金',
   repayaccrual         decimal(17,5) comment '应还款利息',
   repayterm            varchar(4) comment '还款期数',
   repaymethod          varchar(30) comment '还款期数',
   repayaccount         varchar(19) comment '还款账号',
   repayperson          varchar(80) comment '还款人',
   chgdt                datetime comment '最后修改时间',
   chgtl                varchar(8) comment '最后修改人',
   primary key (id)
);

alter table repayplan comment '还款计划表';

/*==============================================================*/
/* Table: repaytoinfo                                           */
/*==============================================================*/
create table repaytoinfo
(
   id                   varchar(19) not null comment 'Id主键',
   batchorg             varchar(20) comment '批复机构',
   sumofamount          decimal(17,5) comment '批复金额',
   interestrate         decimal(9,6) comment '批复利率',
   loanlimittime        varchar(4) comment '贷款期限',
   useofloan            varchar(200) comment '贷款用途',
   chgdt                datetime comment '最后修改时间',
   chgtl                varchar(8) comment '最后修改人',
   primary key (id)
);

alter table repaytoinfo comment '批复信息表';

/*==============================================================*/
/* Table: reservations                                          */
/*==============================================================*/
create table reservations
(
   id                   varchar(19) not null comment '主键id',
   reservationtime      datetime comment '预约时间',
   custname             varchar(80) comment '预约客户名称',
   reservationplace     varchar(300) comment '预约地点',
   custcontactway       varchar(30) comment '客户联系方式',
   dueofplanform        varchar(80) comment '平台尽调专员',
   chanassistant        varchar(80) comment '渠道协助人',
   relationworkid       varchar(10) comment '关联流水编号',
   chgtl                varchar(10) comment '最后修改人',
   chgdt                datetime comment '最后修改时间',
   primary key (id)
);

alter table reservations comment '预约下户信息表';

/*==============================================================*/
/* Table: rolemenu                                              */
/*==============================================================*/
create table rolemenu
(
   id                   varchar(19) not null,
   roleid               varchar(4),
   menuid               varchar(6),
   editflg              char(1),
   viewflg              char(1),
   chgtl                varchar(8),
   chgdt                datetime,
   primary key (id)
);

alter table rolemenu comment '角色菜单表';

/*==============================================================*/
/* Table: scoreresult                                           */
/*==============================================================*/
create table scoreresult
(
   id                   varchar(19) not null,
   workid               varchar(10),
   custgrade            decimal(5,2),
   pledgegrade          decimal(5,2),
   rategrade            decimal(5,2),
   mortgagerate         decimal(9,6),
   rate                 decimal(9,6),
   chgtl                varchar(8),
   chgdt                datetime,
   primary key (id)
);

alter table scoreresult comment '评分结果表';

/*==============================================================*/
/* Table: sertalno                                              */
/*==============================================================*/
create table sertalno
(
   code                 varchar(10) not null comment '类型',
   seqno                varchar(16) comment '序号',
   descriptions         varchar(200) comment '序号',
   primary key (code)
);

alter table sertalno comment '序号表';

/*==============================================================*/
/* Table: sysparameter                                          */
/*==============================================================*/
create table sysparameter
(
   id                   varchar(19) not null comment '主键id',
   parametertype        varchar(12) comment '参数类型',
   parametername        varchar(12) comment '参数名称',
   parametercontent     varchar(10) comment '参数内容',
   chgtl                varchar(8) comment '最后修改人',
   chgdt                datetime comment '最后修改时间',
   primary key (id)
);

alter table sysparameter comment '系统参数表';

/*==============================================================*/
/* Table: transaction                                           */
/*==============================================================*/
create table transaction
(
   id                   varchar(19) not null comment '主键id',
   accountno            varchar(19) comment '账户账号',
   balancetype          varchar(2) comment '结算类型',
   transname            varchar(80) comment '交易账户',
   transaccount         varchar(19) comment '交易账号',
   transway             varchar(2) comment '交易方式',
   transamount          decimal(17,5) comment '交易金额',
   transtime            datetime comment '交易时间',
   accountamount        decimal(17,5) comment '账户余额',
   dealman              varchar(80) comment '操作人',
   primary key (id)
);

alter table transaction comment '交易记录表';

/*==============================================================*/
/* Table: userrole                                              */
/*==============================================================*/
create table userrole
(
   id                   varchar(19) not null comment '授权编号',
   workerid             varchar(8) comment '用户编号',
   roleid               varchar(4) comment '角色编号',
   type                 varchar(1) comment '授权类型',
   authworkerid         varchar(8) comment '授权人',
   authstate            datetime comment '授权开始时间',
   authend              datetime comment '授权结束日期',
   primary key (id)
);

alter table userrole comment '用户角色表';

/*==============================================================*/
/* Table: workhistory                                           */
/*==============================================================*/
create table workhistory
(
   id                   varchar(19) not null comment '主键id',
   workid               varchar(10) comment '流水编号',
   userid               varchar(8) comment '审批人',
   node                 varchar(4) comment '节点',
   nextnode             varchar(4) comment '下一节点',
   notation             longtext comment '审批意见',
   operation            varchar(80) comment '操作',
   operdate             varchar(8) comment '操作日期',
   opertime             varchar(6) comment '操作时间',
   primary key (id)
);

alter table workhistory comment '审批历史记录表';

/*==============================================================*/
/* Table: workitem                                              */
/*==============================================================*/
create table workitem
(
   workid               varchar(10) not null comment '流水编号',
   fork                 varchar(20) comment '分支',
   branch               varchar(20) comment '子流程标志',
   node                 varchar(20) comment '节点',
   state                char(1) comment '状态',
   departlv             varchar(120) comment '部门等级',
   roleid               varchar(4) comment '操作角色',
   userid               varchar(8) comment '操作人',
   version              datetime comment '时间',
   primary key (workid)
);

alter table workitem comment '流程条数表';

/*==============================================================*/
/* Table: workproc                                              */
/*==============================================================*/
create table workproc
(
   workid               varchar(10) not null comment '流水编号',
   process              varchar(80) comment '流程类型',
   departid             varchar(9) comment '部门编号',
   creator              varchar(8) comment '创建人',
   createdate           varchar(8) comment '创建日期',
   createtime           varchar(6) comment '创建时间',
   primary key (workid)
);

alter table workproc comment '流程进度表';

