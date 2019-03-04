package com.example.administrator.cfte.GetLocation;

import java.util.List;

public class MyLocationBean {

    //直接通过AS的GsonFormat插件，将json转换成javaBean


    /**
     * status : 0
     * result : {"location":{"lng":116.51038799999994,"lat":39.90423907788469},"formatted_address":"北京市朝阳区百子湾南路","business":"百子湾,四惠,十里堡","addressComponent":{"country":"中国","country_code":0,"country_code_iso":"CHN","country_code_iso2":"CN","province":"北京市","city":"北京市","city_level":2,"district":"朝阳区","town":"","adcode":"110105","street":"百子湾南路","street_number":"","direction":"","distance":""},"pois":[{"addr":"朝阳区百子湾路5号广渠东路33号(广渠路与百子湾路交汇","cp":"","direction":"内","distance":"0","name":"沿海赛洛城","poiType":"房地产","point":{"x":116.50929936964548,"y":39.90313697584482},"tag":"房地产","tel":"","uid":"4cfc7da722436aa830169b9f","zip":"","parent_poi":{"name":"","tag":"","addr":"","point":{"x":0,"y":0},"direction":"","distance":"","uid":""}},{"addr":"百子湾南一路与石门东路交叉口东南200米","cp":" ","direction":"附近","distance":"46","name":"沿海赛洛城-南1门","poiType":"出入口","point":{"x":116.51044920069825,"y":39.90391879662861},"tag":"出入口;门","tel":"","uid":"d656dec2803436a325e0a002","zip":"","parent_poi":{"name":"沿海赛洛城","tag":"房地产;住宅区","addr":"朝阳区百子湾路5号广渠东路33号(广渠路与百子湾路交汇处)","point":{"x":116.51141937064904,"y":39.903282270653065},"direction":"西北","distance":"179","uid":"4cfc7da722436aa830169b9f"}},{"addr":"北京市朝阳区百子湾东里甲212号","cp":" ","direction":"附近","distance":"38","name":"水南庄幼儿园","poiType":"教育培训","point":{"x":116.51053903124925,"y":39.90400182131643},"tag":"教育培训;幼儿园","tel":"","uid":"43deebfa04bca76ea20464df","zip":"","parent_poi":{"name":"","tag":"","addr":"","point":{"x":0,"y":0},"direction":"","distance":"","uid":""}},{"addr":"百子湾东里209号楼2单元1702室","cp":" ","direction":"南","distance":"130","name":"沿海赛洛城-北1门","poiType":"出入口","point":{"x":116.51032343792686,"y":39.90514340048999},"tag":"出入口;门","tel":"","uid":"defb82ca78c13fa507026f47","zip":"","parent_poi":{"name":"沿海赛洛城","tag":"房地产;住宅区","addr":"朝阳区百子湾路5号广渠东路33号(广渠路与百子湾路交汇处)","point":{"x":116.51141937064904,"y":39.903282270653065},"direction":"西北","distance":"179","uid":"4cfc7da722436aa830169b9f"}},{"addr":"北京市朝阳区沿海赛洛城213-4","cp":" ","direction":"西北","distance":"87","name":"海洋幼稚园","poiType":"教育培训","point":{"x":116.51100615011444,"y":39.903863446780406},"tag":"教育培训;幼儿园","tel":"","uid":"3cf1f9d21738f6993904b16c","zip":"","parent_poi":{"name":"","tag":"","addr":"","point":{"x":0,"y":0},"direction":"","distance":"","uid":""}},{"addr":"南磨房石门东路百子湾东里202底商","cp":" ","direction":"东南","distance":"119","name":"肌肤花园","poiType":"房地产","point":{"x":116.50940716630667,"y":39.90457607263057},"tag":"房地产;住宅区","tel":"","uid":"c24dd80dd85b8ebe1e1d11c3","zip":"","parent_poi":{"name":"","tag":"","addr":"","point":{"x":0,"y":0},"direction":"","distance":"","uid":""}},{"addr":"南磨房百子湾西里石门东路229号","cp":" ","direction":"东","distance":"226","name":"乔伊双语幼儿园","poiType":"教育培训","point":{"x":116.5084010641355,"y":39.90391187790006},"tag":"教育培训;幼儿园","tel":"","uid":"3d2eebaee3d9ee67adb22ad2","zip":"","parent_poi":{"name":"","tag":"","addr":"","point":{"x":0,"y":0},"direction":"","distance":"","uid":""}},{"addr":"百子湾路5号沿海赛洛城305-6号（近大望路）","cp":" ","direction":"北","distance":"345","name":"金雨点私房菜","poiType":"美食","point":{"x":116.50954191213317,"y":39.90194001155905},"tag":"美食;中餐厅","tel":"","uid":"fa7da3e87c43077b42d63e59","zip":"","parent_poi":{"name":"","tag":"","addr":"","point":{"x":0,"y":0},"direction":"","distance":"","uid":""}},{"addr":"石门东路与金海湾花园中街交叉口东北150米","cp":" ","direction":"北","distance":"274","name":"北京市公安局朝阳分局南磨房派出所赛洛城社区警务工作室","poiType":"政府机构","point":{"x":116.50989225128207,"y":39.902375902727556},"tag":"政府机构;公检法机构","tel":"","uid":"481a1df88ae5c857e6e96559","zip":"","parent_poi":{"name":"","tag":"","addr":"","point":{"x":0,"y":0},"direction":"","distance":"","uid":""}},{"addr":"百子湾东里312号楼1层312-05","cp":" ","direction":"北","distance":"372","name":"果蔬大卖场赛洛城店","poiType":"购物","point":{"x":116.51072767540634,"y":39.90167709172503},"tag":"购物;家电数码","tel":"","uid":"5d528b63d5ae630435b06c1b","zip":"","parent_poi":{"name":"","tag":"","addr":"","point":{"x":0,"y":0},"direction":"","distance":"","uid":""}}],"roads":[],"poiRegions":[{"direction_desc":"内","name":"沿海赛洛城","tag":"房地产","uid":"4cfc7da722436aa830169b9f"}],"sematic_description":"沿海赛洛城内,水南庄幼儿园附近38米","cityCode":131}
     */

    private int status;
    private ResultBean result;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * location : {"lng":116.51038799999994,"lat":39.90423907788469}
         * formatted_address : 北京市朝阳区百子湾南路
         * business : 百子湾,四惠,十里堡
         * addressComponent : {"country":"中国","country_code":0,"country_code_iso":"CHN","country_code_iso2":"CN","province":"北京市","city":"北京市","city_level":2,"district":"朝阳区","town":"","adcode":"110105","street":"百子湾南路","street_number":"","direction":"","distance":""}
         * pois : [{"addr":"朝阳区百子湾路5号广渠东路33号(广渠路与百子湾路交汇","cp":"","direction":"内","distance":"0","name":"沿海赛洛城","poiType":"房地产","point":{"x":116.50929936964548,"y":39.90313697584482},"tag":"房地产","tel":"","uid":"4cfc7da722436aa830169b9f","zip":"","parent_poi":{"name":"","tag":"","addr":"","point":{"x":0,"y":0},"direction":"","distance":"","uid":""}},{"addr":"百子湾南一路与石门东路交叉口东南200米","cp":" ","direction":"附近","distance":"46","name":"沿海赛洛城-南1门","poiType":"出入口","point":{"x":116.51044920069825,"y":39.90391879662861},"tag":"出入口;门","tel":"","uid":"d656dec2803436a325e0a002","zip":"","parent_poi":{"name":"沿海赛洛城","tag":"房地产;住宅区","addr":"朝阳区百子湾路5号广渠东路33号(广渠路与百子湾路交汇处)","point":{"x":116.51141937064904,"y":39.903282270653065},"direction":"西北","distance":"179","uid":"4cfc7da722436aa830169b9f"}},{"addr":"北京市朝阳区百子湾东里甲212号","cp":" ","direction":"附近","distance":"38","name":"水南庄幼儿园","poiType":"教育培训","point":{"x":116.51053903124925,"y":39.90400182131643},"tag":"教育培训;幼儿园","tel":"","uid":"43deebfa04bca76ea20464df","zip":"","parent_poi":{"name":"","tag":"","addr":"","point":{"x":0,"y":0},"direction":"","distance":"","uid":""}},{"addr":"百子湾东里209号楼2单元1702室","cp":" ","direction":"南","distance":"130","name":"沿海赛洛城-北1门","poiType":"出入口","point":{"x":116.51032343792686,"y":39.90514340048999},"tag":"出入口;门","tel":"","uid":"defb82ca78c13fa507026f47","zip":"","parent_poi":{"name":"沿海赛洛城","tag":"房地产;住宅区","addr":"朝阳区百子湾路5号广渠东路33号(广渠路与百子湾路交汇处)","point":{"x":116.51141937064904,"y":39.903282270653065},"direction":"西北","distance":"179","uid":"4cfc7da722436aa830169b9f"}},{"addr":"北京市朝阳区沿海赛洛城213-4","cp":" ","direction":"西北","distance":"87","name":"海洋幼稚园","poiType":"教育培训","point":{"x":116.51100615011444,"y":39.903863446780406},"tag":"教育培训;幼儿园","tel":"","uid":"3cf1f9d21738f6993904b16c","zip":"","parent_poi":{"name":"","tag":"","addr":"","point":{"x":0,"y":0},"direction":"","distance":"","uid":""}},{"addr":"南磨房石门东路百子湾东里202底商","cp":" ","direction":"东南","distance":"119","name":"肌肤花园","poiType":"房地产","point":{"x":116.50940716630667,"y":39.90457607263057},"tag":"房地产;住宅区","tel":"","uid":"c24dd80dd85b8ebe1e1d11c3","zip":"","parent_poi":{"name":"","tag":"","addr":"","point":{"x":0,"y":0},"direction":"","distance":"","uid":""}},{"addr":"南磨房百子湾西里石门东路229号","cp":" ","direction":"东","distance":"226","name":"乔伊双语幼儿园","poiType":"教育培训","point":{"x":116.5084010641355,"y":39.90391187790006},"tag":"教育培训;幼儿园","tel":"","uid":"3d2eebaee3d9ee67adb22ad2","zip":"","parent_poi":{"name":"","tag":"","addr":"","point":{"x":0,"y":0},"direction":"","distance":"","uid":""}},{"addr":"百子湾路5号沿海赛洛城305-6号（近大望路）","cp":" ","direction":"北","distance":"345","name":"金雨点私房菜","poiType":"美食","point":{"x":116.50954191213317,"y":39.90194001155905},"tag":"美食;中餐厅","tel":"","uid":"fa7da3e87c43077b42d63e59","zip":"","parent_poi":{"name":"","tag":"","addr":"","point":{"x":0,"y":0},"direction":"","distance":"","uid":""}},{"addr":"石门东路与金海湾花园中街交叉口东北150米","cp":" ","direction":"北","distance":"274","name":"北京市公安局朝阳分局南磨房派出所赛洛城社区警务工作室","poiType":"政府机构","point":{"x":116.50989225128207,"y":39.902375902727556},"tag":"政府机构;公检法机构","tel":"","uid":"481a1df88ae5c857e6e96559","zip":"","parent_poi":{"name":"","tag":"","addr":"","point":{"x":0,"y":0},"direction":"","distance":"","uid":""}},{"addr":"百子湾东里312号楼1层312-05","cp":" ","direction":"北","distance":"372","name":"果蔬大卖场赛洛城店","poiType":"购物","point":{"x":116.51072767540634,"y":39.90167709172503},"tag":"购物;家电数码","tel":"","uid":"5d528b63d5ae630435b06c1b","zip":"","parent_poi":{"name":"","tag":"","addr":"","point":{"x":0,"y":0},"direction":"","distance":"","uid":""}}]
         * roads : []
         * poiRegions : [{"direction_desc":"内","name":"沿海赛洛城","tag":"房地产","uid":"4cfc7da722436aa830169b9f"}]
         * sematic_description : 沿海赛洛城内,水南庄幼儿园附近38米
         * cityCode : 131
         */

        private LocationBean location;
        private String formatted_address;
        private String business;
        private AddressComponentBean addressComponent;
        private String sematic_description;
        private int cityCode;
        private List<PoisBean> pois;
        private List<?> roads;
        private List<PoiRegionsBean> poiRegions;

        public LocationBean getLocation() {
            return location;
        }

        public void setLocation(LocationBean location) {
            this.location = location;
        }

        public String getFormatted_address() {
            return formatted_address;
        }

        public void setFormatted_address(String formatted_address) {
            this.formatted_address = formatted_address;
        }

        public String getBusiness() {
            return business;
        }

        public void setBusiness(String business) {
            this.business = business;
        }

        public AddressComponentBean getAddressComponent() {
            return addressComponent;
        }

        public void setAddressComponent(AddressComponentBean addressComponent) {
            this.addressComponent = addressComponent;
        }

        public String getSematic_description() {
            return sematic_description;
        }

        public void setSematic_description(String sematic_description) {
            this.sematic_description = sematic_description;
        }

        public int getCityCode() {
            return cityCode;
        }

        public void setCityCode(int cityCode) {
            this.cityCode = cityCode;
        }

        public List<PoisBean> getPois() {
            return pois;
        }

        public void setPois(List<PoisBean> pois) {
            this.pois = pois;
        }

        public List<?> getRoads() {
            return roads;
        }

        public void setRoads(List<?> roads) {
            this.roads = roads;
        }

        public List<PoiRegionsBean> getPoiRegions() {
            return poiRegions;
        }

        public void setPoiRegions(List<PoiRegionsBean> poiRegions) {
            this.poiRegions = poiRegions;
        }

        public static class LocationBean {
            /**
             * lng : 116.51038799999994
             * lat : 39.90423907788469
             */

            private double lng;
            private double lat;

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }
        }

        public static class AddressComponentBean {
            /**
             * country : 中国
             * country_code : 0
             * country_code_iso : CHN
             * country_code_iso2 : CN
             * province : 北京市
             * city : 北京市
             * city_level : 2
             * district : 朝阳区
             * town :
             * adcode : 110105
             * street : 百子湾南路
             * street_number :
             * direction :
             * distance :
             */

            private String country;
            private int country_code;
            private String country_code_iso;
            private String country_code_iso2;
            private String province;
            private String city;
            private int city_level;
            private String district;
            private String town;
            private String adcode;
            private String street;
            private String street_number;
            private String direction;
            private String distance;

            public String getCountry() {
                return country;
            }

            public void setCountry(String country) {
                this.country = country;
            }

            public int getCountry_code() {
                return country_code;
            }

            public void setCountry_code(int country_code) {
                this.country_code = country_code;
            }

            public String getCountry_code_iso() {
                return country_code_iso;
            }

            public void setCountry_code_iso(String country_code_iso) {
                this.country_code_iso = country_code_iso;
            }

            public String getCountry_code_iso2() {
                return country_code_iso2;
            }

            public void setCountry_code_iso2(String country_code_iso2) {
                this.country_code_iso2 = country_code_iso2;
            }

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public int getCity_level() {
                return city_level;
            }

            public void setCity_level(int city_level) {
                this.city_level = city_level;
            }

            public String getDistrict() {
                return district;
            }

            public void setDistrict(String district) {
                this.district = district;
            }

            public String getTown() {
                return town;
            }

            public void setTown(String town) {
                this.town = town;
            }

            public String getAdcode() {
                return adcode;
            }

            public void setAdcode(String adcode) {
                this.adcode = adcode;
            }

            public String getStreet() {
                return street;
            }

            public void setStreet(String street) {
                this.street = street;
            }

            public String getStreet_number() {
                return street_number;
            }

            public void setStreet_number(String street_number) {
                this.street_number = street_number;
            }

            public String getDirection() {
                return direction;
            }

            public void setDirection(String direction) {
                this.direction = direction;
            }

            public String getDistance() {
                return distance;
            }

            public void setDistance(String distance) {
                this.distance = distance;
            }
        }

        public static class PoisBean {
            /**
             * addr : 朝阳区百子湾路5号广渠东路33号(广渠路与百子湾路交汇
             * cp :
             * direction : 内
             * distance : 0
             * name : 沿海赛洛城
             * poiType : 房地产
             * point : {"x":116.50929936964548,"y":39.90313697584482}
             * tag : 房地产
             * tel :
             * uid : 4cfc7da722436aa830169b9f
             * zip :
             * parent_poi : {"name":"","tag":"","addr":"","point":{"x":0,"y":0},"direction":"","distance":"","uid":""}
             */

            private String addr;
            private String cp;
            private String direction;
            private String distance;
            private String name;
            private String poiType;
            private PointBean point;
            private String tag;
            private String tel;
            private String uid;
            private String zip;
            private ParentPoiBean parent_poi;

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public String getCp() {
                return cp;
            }

            public void setCp(String cp) {
                this.cp = cp;
            }

            public String getDirection() {
                return direction;
            }

            public void setDirection(String direction) {
                this.direction = direction;
            }

            public String getDistance() {
                return distance;
            }

            public void setDistance(String distance) {
                this.distance = distance;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPoiType() {
                return poiType;
            }

            public void setPoiType(String poiType) {
                this.poiType = poiType;
            }

            public PointBean getPoint() {
                return point;
            }

            public void setPoint(PointBean point) {
                this.point = point;
            }

            public String getTag() {
                return tag;
            }

            public void setTag(String tag) {
                this.tag = tag;
            }

            public String getTel() {
                return tel;
            }

            public void setTel(String tel) {
                this.tel = tel;
            }

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getZip() {
                return zip;
            }

            public void setZip(String zip) {
                this.zip = zip;
            }

            public ParentPoiBean getParent_poi() {
                return parent_poi;
            }

            public void setParent_poi(ParentPoiBean parent_poi) {
                this.parent_poi = parent_poi;
            }

            public static class PointBean {
                /**
                 * x : 116.50929936964548
                 * y : 39.90313697584482
                 */

                private double x;
                private double y;

                public double getX() {
                    return x;
                }

                public void setX(double x) {
                    this.x = x;
                }

                public double getY() {
                    return y;
                }

                public void setY(double y) {
                    this.y = y;
                }
            }

            public static class ParentPoiBean {
                /**
                 * name :
                 * tag :
                 * addr :
                 * point : {"x":0,"y":0}
                 * direction :
                 * distance :
                 * uid :
                 */

                private String name;
                private String tag;
                private String addr;
                private PointBeanX point;
                private String direction;
                private String distance;
                private String uid;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getTag() {
                    return tag;
                }

                public void setTag(String tag) {
                    this.tag = tag;
                }

                public String getAddr() {
                    return addr;
                }

                public void setAddr(String addr) {
                    this.addr = addr;
                }

                public PointBeanX getPoint() {
                    return point;
                }

                public void setPoint(PointBeanX point) {
                    this.point = point;
                }

                public String getDirection() {
                    return direction;
                }

                public void setDirection(String direction) {
                    this.direction = direction;
                }

                public String getDistance() {
                    return distance;
                }

                public void setDistance(String distance) {
                    this.distance = distance;
                }

                public String getUid() {
                    return uid;
                }

                public void setUid(String uid) {
                    this.uid = uid;
                }

                public static class PointBeanX {
                    /**
                     * x : 0.0
                     * y : 0.0
                     */

                    private double x;
                    private double y;

                    public double getX() {
                        return x;
                    }

                    public void setX(double x) {
                        this.x = x;
                    }

                    public double getY() {
                        return y;
                    }

                    public void setY(double y) {
                        this.y = y;
                    }
                }
            }
        }

        public static class PoiRegionsBean {
            /**
             * direction_desc : 内
             * name : 沿海赛洛城
             * tag : 房地产
             * uid : 4cfc7da722436aa830169b9f
             */

            private String direction_desc;
            private String name;
            private String tag;
            private String uid;

            public String getDirection_desc() {
                return direction_desc;
            }

            public void setDirection_desc(String direction_desc) {
                this.direction_desc = direction_desc;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getTag() {
                return tag;
            }

            public void setTag(String tag) {
                this.tag = tag;
            }

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }
        }
    }
}
