# Factory Method 模式
## 角色
- Product(产品)
- Creator(创建者)
    - 不用new关键字来生成实例，而是调用生成实例的专用方法来生成实例，这样就可以防止父类与其他具体类耦合

- ConcreteProduct(具体的产品)
- ConcreteCreator(具体的创建者)

## 拓展思路的要点
### 框架与具体加工

### 生成实例——方法的三种实现方式
- 指定其为抽象方法
- 为其实现默认处理
- 在其中抛出异常

### 使用模式与开发人员之间的沟通
- 如果使用了设计模式，应当在开发文档中注明 所使用的设计模式的名称和意图