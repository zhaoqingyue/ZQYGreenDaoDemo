package com.zqy.greendaodemo.db;

import android.content.Context;

import com.zqy.greendaodemo.Student;
import com.zqy.greendaodemo.dao.StudentDao;

import org.greenrobot.greendao.query.QueryBuilder;

import java.util.List;

/**
 * Created by zhaoqy on 2018/4/28.
 */

public class StudentDaoOpe {

    /**
     * 添加数据至数据库
     *
     * @param context
     * @param stu
     */
    public static void insertData(Context context, Student stu) {
        DbManager.getDaoSession(context).getStudentDao().insert(stu);
    }

    /**
     * 将数据实体通过事务添加至数据库
     *
     * @param list
     */
    public static void insertData(Context context, List<Student> list) {
        if (null == list || list.size() <= 0) {
            return;
        }
        DbManager.getDaoSession(context).getStudentDao().insertInTx(list);
    }

    /**
     * 添加数据至数据库，如果存在，将原来的数据覆盖
     * 内部代码判断了如果存在就update(entity);不存在就insert(entity)；
     *
     * @param student
     */
    public static void saveData(Context context, Student student) {
        DbManager.getDaoSession(context).getStudentDao().save(student);
    }

    /**
     * 删除数据至数据库
     *
     * @param student 删除具体内容
     */
    public static void deleteData(Context context, Student student) {
        DbManager.getDaoSession(context).getStudentDao().delete(student);
    }

    /**
     * 根据id删除数据至数据库
     *
     * @param id      删除具体内容
     */
    public static void deleteByKeyData(Context context, long id) {
        DbManager.getDaoSession(context).getStudentDao().deleteByKey(id);
    }

    /**
     * 删除全部数据
     */
    public static void deleteAllData(Context context) {
        DbManager.getDaoSession(context).getStudentDao().deleteAll();
    }

    /**
     * 更新数据库
     * @param student
     */
    public static void updateData(Context context, Student student) {
        DbManager.getDaoSession(context).getStudentDao().update(student);
    }


    /**
     * 查询所有数据
     */
    public static List<Student> queryAll(Context context) {
        QueryBuilder<Student> builder = DbManager.getDaoSession(context).getStudentDao().queryBuilder();

        return builder.build().list();
    }

    /**
     *  分页加载
     * @param pageSize 当前第几页(程序中动态修改pageSize的值即可)
     * @param pageNum  每页显示多少个
     */
    public static List<Student> queryPaging( int pageSize, int pageNum,Context context){
        StudentDao studentDao = DbManager.getDaoSession(context).getStudentDao();
        List<Student> listMsg = studentDao.queryBuilder()
                .offset(pageSize * pageNum).limit(pageNum).list();
        return listMsg;
    }
}
