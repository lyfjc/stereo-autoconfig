package soundsystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("cDPlayer")
//默认的bean名为类名第一个字母变小写
public class CDPlayer implements MediaPlayer {
  private CompactDisc cd;

  //@Autowired可以用在构造器、Setter方法和其他方法
  //required=false避免未找到匹配时报异常
  @Autowired(required = false)
  public CDPlayer(CompactDisc cd) {
    this.cd = cd;
  }

  public void play() {
    cd.play();
  }

}
