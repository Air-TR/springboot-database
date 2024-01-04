# 如果使用 jpa 建表，mapper.insert 主键生成规则不遵循 jpa 设置的主键生成规则
## 不建议在 mybatis-plus 中使用 jpa，没必要，mybatis 的 insert 主键规则不遵循 jpa 设置
## jpa 中使用 mybatis-plus，只建议将 mybatis 用在 jpa 不方便的查询上，增删改还是使用 jpa

### @AutoMapper：能用但极其难用，经常扫描不到，报错，还会导致项目起不来，不建议用

# @TableId(type = IdType.INPUT)
## AUTO：数据库默认自增策略
## NONE：不设置 id 生成策略
## INPUT：用户手工输入 id，如果 id 为 null 会报错
## ASSIGN_ID：雪花算法生成 id（可兼容数值型与字符串型），mp 默认 id 策略
## ASSIGN_UUID：UUID 作为 id 生成策略