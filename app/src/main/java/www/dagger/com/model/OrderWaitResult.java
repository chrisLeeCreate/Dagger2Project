package www.dagger.com.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lishaowei on 2017/9/6.
 */

public class OrderWaitResult implements Serializable {

    /**
     * orderId : 30f96c95ad1245d8a1621b84054e67a2
     * studentId : 7a7e7649446746a485d04a74e058777f
     * areaCode : 010
     * spend : 12
     * orderCreateTime : 2017-09-06 19:03:24
     * createTime : 2017-09-06 19:08:51
     * expireTime : 30
     * orderNo : ord_010_012017090619032430708980000015583
     * orderSerialNo : 20170906-190324-52666976
     * clientType : 1
     * errorMsg :
     * classInfos : [{"classId":"40288b155de4d9b1015de58f576f00b8","className":"暑期班小学组数学提高班","spend":22,"classType":1,"classDateName":"2018/08/07-2018/08/18","classTimeNames":"周二上午08:00-12:30","regContinue":false,"gradeName":"","areaName":"虚拟地区（直播）","servicecenterName":"虚拟服务中心（直播）","venueName":"虚拟教学点（直播）","teacherHostName":"http://js010.speiyou.com/","tutorId":"40288b155cab3d8a015cabe543db03e6","tutorRealName":"ZX张策","courseId":"010-6UNYpfyEPDkhifNtBxCCm6","classroomName":"虚拟教室（直播）","registerId":"d21cd76692c911e7a8126a492e0db76f","activityId":"","registTime":"2017-09-06 14:08:37","classCreateTime":"2018-08-07 00:00:00","shouldMail":false,"classCount":"2","passedCount":"0","tutorPictureUrl":"","teachers":[{"teacherId":"ff8080815bb0caee015bb3f8c767681e","teacherName":"张肇甜","name":"张肇甜","realName":"张肇甜","sex":0,"pictureUrl":""}],"classCouponFacePrice":"0","couponPrice":0,"discount":1,"discountPrice":"0","off":"10","claPrice":"22.0","claRefFeePrice":"0.0","claActualRefFeePrice":"0","originalPrice":"22","shouldPrice":"22","actualPrice":"12","classActualPrice":12,"offPrice":"10","unitePrice":"0","classExpenseDetails":[{"name":"立减优惠","price":"10","positive":false}],"coupons":[],"promotions":[{"promotionId":"40288b155e4bffd6015e4c4c196d2164","promotionName":null,"promotionType":"8","promotionTypeName":"优惠促销","discount":1,"off":10,"price":10}]}]
     * shouldMail : false
     */

    private String orderId;
    private String studentId;
    private String areaCode;
    private int spend;
    private String orderCreateTime;
    private String createTime;
    private int expireTime;
    private String orderNo;
    private String orderSerialNo;
    private int clientType;
    private String errorMsg;
    private boolean shouldMail;
    private List<ClassInfosBean> classInfos;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public int getSpend() {
        return spend;
    }

    public void setSpend(int spend) {
        this.spend = spend;
    }

    public String getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(String orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public int getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(int expireTime) {
        this.expireTime = expireTime;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderSerialNo() {
        return orderSerialNo;
    }

    public void setOrderSerialNo(String orderSerialNo) {
        this.orderSerialNo = orderSerialNo;
    }

    public int getClientType() {
        return clientType;
    }

    public void setClientType(int clientType) {
        this.clientType = clientType;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public boolean isShouldMail() {
        return shouldMail;
    }

    public void setShouldMail(boolean shouldMail) {
        this.shouldMail = shouldMail;
    }

    public List<ClassInfosBean> getClassInfos() {
        return classInfos;
    }

    public void setClassInfos(List<ClassInfosBean> classInfos) {
        this.classInfos = classInfos;
    }

    public static class ClassInfosBean implements Serializable {
        /**
         * classId : 40288b155de4d9b1015de58f576f00b8
         * className : 暑期班小学组数学提高班
         * spend : 22
         * classType : 1
         * classDateName : 2018/08/07-2018/08/18
         * classTimeNames : 周二上午08:00-12:30
         * regContinue : false
         * gradeName :
         * areaName : 虚拟地区（直播）
         * servicecenterName : 虚拟服务中心（直播）
         * venueName : 虚拟教学点（直播）
         * teacherHostName : http://js010.speiyou.com/
         * tutorId : 40288b155cab3d8a015cabe543db03e6
         * tutorRealName : ZX张策
         * courseId : 010-6UNYpfyEPDkhifNtBxCCm6
         * classroomName : 虚拟教室（直播）
         * registerId : d21cd76692c911e7a8126a492e0db76f
         * activityId :
         * registTime : 2017-09-06 14:08:37
         * classCreateTime : 2018-08-07 00:00:00
         * shouldMail : false
         * classCount : 2
         * passedCount : 0
         * tutorPictureUrl :
         * teachers : [{"teacherId":"ff8080815bb0caee015bb3f8c767681e","teacherName":"张肇甜","name":"张肇甜","realName":"张肇甜","sex":0,"pictureUrl":""}]
         * classCouponFacePrice : 0
         * couponPrice : 0
         * discount : 1
         * discountPrice : 0
         * off : 10
         * claPrice : 22.0
         * claRefFeePrice : 0.0
         * claActualRefFeePrice : 0
         * originalPrice : 22
         * shouldPrice : 22
         * actualPrice : 12
         * classActualPrice : 12
         * offPrice : 10
         * unitePrice : 0
         * classExpenseDetails : [{"name":"立减优惠","price":"10","positive":false}]
         * coupons : []
         * promotions : [{"promotionId":"40288b155e4bffd6015e4c4c196d2164","promotionName":null,"promotionType":"8","promotionTypeName":"优惠促销","discount":1,"off":10,"price":10}]
         */

        private String classId;
        private String className;
        private int spend;
        private int classType;
        private String classDateName;
        private String classTimeNames;
        private boolean regContinue;
        private String gradeName;
        private String areaName;
        private String servicecenterName;
        private String venueName;
        private String teacherHostName;
        private String tutorId;
        private String tutorRealName;
        private String courseId;
        private String classroomName;
        private String registerId;
        private String activityId;
        private String registTime;
        private String classCreateTime;
        private boolean shouldMail;
        private String classCount;
        private String passedCount;
        private String tutorPictureUrl;
        private String classCouponFacePrice;
        private int couponPrice;
        private double discount;
        private String discountPrice;
        private String off;
        private String claPrice;
        private String claRefFeePrice;
        private String claActualRefFeePrice;
        private String originalPrice;
        private String shouldPrice;
        private String actualPrice;
        private int classActualPrice;
        private String offPrice;
        private String unitePrice;
        private List<TeachersBean> teachers;
        private List<ClassExpenseDetailsBean> classExpenseDetails;
        private List<?> coupons;
        private List<PromotionsBean> promotions;

        public String getClassId() {
            return classId;
        }

        public void setClassId(String classId) {
            this.classId = classId;
        }

        public String getClassName() {
            return className;
        }

        public void setClassName(String className) {
            this.className = className;
        }

        public int getSpend() {
            return spend;
        }

        public void setSpend(int spend) {
            this.spend = spend;
        }

        public int getClassType() {
            return classType;
        }

        public void setClassType(int classType) {
            this.classType = classType;
        }

        public String getClassDateName() {
            return classDateName;
        }

        public void setClassDateName(String classDateName) {
            this.classDateName = classDateName;
        }

        public String getClassTimeNames() {
            return classTimeNames;
        }

        public void setClassTimeNames(String classTimeNames) {
            this.classTimeNames = classTimeNames;
        }

        public boolean isRegContinue() {
            return regContinue;
        }

        public void setRegContinue(boolean regContinue) {
            this.regContinue = regContinue;
        }

        public String getGradeName() {
            return gradeName;
        }

        public void setGradeName(String gradeName) {
            this.gradeName = gradeName;
        }

        public String getAreaName() {
            return areaName;
        }

        public void setAreaName(String areaName) {
            this.areaName = areaName;
        }

        public String getServicecenterName() {
            return servicecenterName;
        }

        public void setServicecenterName(String servicecenterName) {
            this.servicecenterName = servicecenterName;
        }

        public String getVenueName() {
            return venueName;
        }

        public void setVenueName(String venueName) {
            this.venueName = venueName;
        }

        public String getTeacherHostName() {
            return teacherHostName;
        }

        public void setTeacherHostName(String teacherHostName) {
            this.teacherHostName = teacherHostName;
        }

        public String getTutorId() {
            return tutorId;
        }

        public void setTutorId(String tutorId) {
            this.tutorId = tutorId;
        }

        public String getTutorRealName() {
            return tutorRealName;
        }

        public void setTutorRealName(String tutorRealName) {
            this.tutorRealName = tutorRealName;
        }

        public String getCourseId() {
            return courseId;
        }

        public void setCourseId(String courseId) {
            this.courseId = courseId;
        }

        public String getClassroomName() {
            return classroomName;
        }

        public void setClassroomName(String classroomName) {
            this.classroomName = classroomName;
        }

        public String getRegisterId() {
            return registerId;
        }

        public void setRegisterId(String registerId) {
            this.registerId = registerId;
        }

        public String getActivityId() {
            return activityId;
        }

        public void setActivityId(String activityId) {
            this.activityId = activityId;
        }

        public String getRegistTime() {
            return registTime;
        }

        public void setRegistTime(String registTime) {
            this.registTime = registTime;
        }

        public String getClassCreateTime() {
            return classCreateTime;
        }

        public void setClassCreateTime(String classCreateTime) {
            this.classCreateTime = classCreateTime;
        }

        public boolean isShouldMail() {
            return shouldMail;
        }

        public void setShouldMail(boolean shouldMail) {
            this.shouldMail = shouldMail;
        }

        public String getClassCount() {
            return classCount;
        }

        public void setClassCount(String classCount) {
            this.classCount = classCount;
        }

        public String getPassedCount() {
            return passedCount;
        }

        public void setPassedCount(String passedCount) {
            this.passedCount = passedCount;
        }

        public String getTutorPictureUrl() {
            return tutorPictureUrl;
        }

        public void setTutorPictureUrl(String tutorPictureUrl) {
            this.tutorPictureUrl = tutorPictureUrl;
        }

        public String getClassCouponFacePrice() {
            return classCouponFacePrice;
        }

        public void setClassCouponFacePrice(String classCouponFacePrice) {
            this.classCouponFacePrice = classCouponFacePrice;
        }

        public int getCouponPrice() {
            return couponPrice;
        }

        public void setCouponPrice(int couponPrice) {
            this.couponPrice = couponPrice;
        }

        public double getDiscount() {
            return discount;
        }

        public void setDiscount(double discount) {
            this.discount = discount;
        }

        public String getDiscountPrice() {
            return discountPrice;
        }

        public void setDiscountPrice(String discountPrice) {
            this.discountPrice = discountPrice;
        }

        public String getOff() {
            return off;
        }

        public void setOff(String off) {
            this.off = off;
        }

        public String getClaPrice() {
            return claPrice;
        }

        public void setClaPrice(String claPrice) {
            this.claPrice = claPrice;
        }

        public String getClaRefFeePrice() {
            return claRefFeePrice;
        }

        public void setClaRefFeePrice(String claRefFeePrice) {
            this.claRefFeePrice = claRefFeePrice;
        }

        public String getClaActualRefFeePrice() {
            return claActualRefFeePrice;
        }

        public void setClaActualRefFeePrice(String claActualRefFeePrice) {
            this.claActualRefFeePrice = claActualRefFeePrice;
        }

        public String getOriginalPrice() {
            return originalPrice;
        }

        public void setOriginalPrice(String originalPrice) {
            this.originalPrice = originalPrice;
        }

        public String getShouldPrice() {
            return shouldPrice;
        }

        public void setShouldPrice(String shouldPrice) {
            this.shouldPrice = shouldPrice;
        }

        public String getActualPrice() {
            return actualPrice;
        }

        public void setActualPrice(String actualPrice) {
            this.actualPrice = actualPrice;
        }

        public int getClassActualPrice() {
            return classActualPrice;
        }

        public void setClassActualPrice(int classActualPrice) {
            this.classActualPrice = classActualPrice;
        }

        public String getOffPrice() {
            return offPrice;
        }

        public void setOffPrice(String offPrice) {
            this.offPrice = offPrice;
        }

        public String getUnitePrice() {
            return unitePrice;
        }

        public void setUnitePrice(String unitePrice) {
            this.unitePrice = unitePrice;
        }

        public List<TeachersBean> getTeachers() {
            return teachers;
        }

        public void setTeachers(List<TeachersBean> teachers) {
            this.teachers = teachers;
        }

        public List<ClassExpenseDetailsBean> getClassExpenseDetails() {
            return classExpenseDetails;
        }

        public void setClassExpenseDetails(List<ClassExpenseDetailsBean> classExpenseDetails) {
            this.classExpenseDetails = classExpenseDetails;
        }

        public List<?> getCoupons() {
            return coupons;
        }

        public void setCoupons(List<?> coupons) {
            this.coupons = coupons;
        }

        public List<PromotionsBean> getPromotions() {
            return promotions;
        }

        public void setPromotions(List<PromotionsBean> promotions) {
            this.promotions = promotions;
        }

        public static class TeachersBean implements Serializable {
            /**
             * teacherId : ff8080815bb0caee015bb3f8c767681e
             * teacherName : 张肇甜
             * name : 张肇甜
             * realName : 张肇甜
             * sex : 0
             * pictureUrl :
             */

            private String teacherId;
            private String teacherName;
            private String name;
            private String realName;
            private int sex;
            private String pictureUrl;

            public String getTeacherId() {
                return teacherId;
            }

            public void setTeacherId(String teacherId) {
                this.teacherId = teacherId;
            }

            public String getTeacherName() {
                return teacherName;
            }

            public void setTeacherName(String teacherName) {
                this.teacherName = teacherName;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRealName() {
                return realName;
            }

            public void setRealName(String realName) {
                this.realName = realName;
            }

            public int getSex() {
                return sex;
            }

            public void setSex(int sex) {
                this.sex = sex;
            }

            public String getPictureUrl() {
                return pictureUrl;
            }

            public void setPictureUrl(String pictureUrl) {
                this.pictureUrl = pictureUrl;
            }
        }

        public static class ClassExpenseDetailsBean implements Serializable {
            /**
             * name : 立减优惠
             * price : 10
             * positive : false
             */

            private String name;
            private String price;
            private boolean positive;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public boolean isPositive() {
                return positive;
            }

            public void setPositive(boolean positive) {
                this.positive = positive;
            }
        }

        public static class PromotionsBean implements Serializable {
            /**
             * promotionId : 40288b155e4bffd6015e4c4c196d2164
             * promotionName : null
             * promotionType : 8
             * promotionTypeName : 优惠促销
             * discount : 1
             * off : 10
             * price : 10
             */

            private String promotionId;
            private Object promotionName;
            private String promotionType;
            private String promotionTypeName;
            private double discount;
            private int off;
            private int price;

            public String getPromotionId() {
                return promotionId;
            }

            public void setPromotionId(String promotionId) {
                this.promotionId = promotionId;
            }

            public Object getPromotionName() {
                return promotionName;
            }

            public void setPromotionName(Object promotionName) {
                this.promotionName = promotionName;
            }

            public String getPromotionType() {
                return promotionType;
            }

            public void setPromotionType(String promotionType) {
                this.promotionType = promotionType;
            }

            public String getPromotionTypeName() {
                return promotionTypeName;
            }

            public void setPromotionTypeName(String promotionTypeName) {
                this.promotionTypeName = promotionTypeName;
            }

            public double getDiscount() {
                return discount;
            }

            public void setDiscount(double discount) {
                this.discount = discount;
            }

            public int getOff() {
                return off;
            }

            public void setOff(int off) {
                this.off = off;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }
        }
    }
}
