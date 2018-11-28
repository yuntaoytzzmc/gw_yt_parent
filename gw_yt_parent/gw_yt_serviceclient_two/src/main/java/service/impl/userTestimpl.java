package service.impl;
import com.taotao.mapper.TbUserMapper;
import com.taotao.pojo.TbUser;
import com.taotao.pojo.TbUserExample;
import com.taotao.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Transactional
public class userTestimpl implements Userservice {
    @Autowired
    public TbUserMapper tbUserMapper;
    @Override
    public List<TbUser> selecruser() {
        //System.out.println("yuntao");
        TbUserExample  tb  = new TbUserExample();
        List<TbUser>list =  tbUserMapper.selectByExample(tb);
        return list;
    }
}
