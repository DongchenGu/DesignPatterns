package 工厂方法模式;

//将pizza类做成抽象
public abstract class Pizza {
   protected String name; //名字
   //准备原材料，不同的pizza不一样
   public abstract void prepare();
   
   public void bake() {
	   System.out.println(name+"baking");
   }
   public void cut() {
	   System.out.println(name+"cuting");
   }
   //打包
   public void box() {
	   System.out.println(name+"boxing");
   }
   //设置名字
   public void setName(String name) {
	   this.name = name;
   }
   
   
}
