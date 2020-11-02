<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2020/10/29
  Time: 13:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="js/1683/cityselect.css">
    <style type="text/css">
        .out{
            height: 35px;
            width: 220px;
            border-width: 1px;
            border-style: solid;
            border-color: rgb(175, 189, 207);
            border-image: initial;
            border-radius: 2px;
            position: relative;
        }
        .middle1{
            width: 40px;
            height: 35px;
            display: block;
            float: left;
            background: url(imgs/UI.png) 8px 10px no-repeat rgb(175, 189, 207);
        }
        .middle12{
            width: 40px;
            height: 35px;
            display: block;
            float: left;
            background: url(imgs/UI.png) -29px 10px no-repeat rgb(175, 189, 207);
        }
        .middle13{
            width: 40px;
            height: 35px;
            display: block;
            float: left;
            background: url(imgs/UI.png) 11px -20px no-repeat rgb(175, 189, 207);
        }
        .inp{
            line-height: 35px;
            width: 170px;
            float: left;
            height: 35px;
            border-width: 0px;
            border-style: initial;
            border-color: initial;
            border-image: initial;
            padding: 0px 5px;
        }
        .position{
            position: absolute;
            display: inline-block;
            top:5px;
            right: 3px;
            width: 20px;
            height: 30px;
            line-height: 20px;
            vertical-align: top;
            background:url("imgs/location.png") no-repeat;
            cursor: pointer;
        }
        .left{
            width: 236px;
            height: 60px;
            display: inline-block;
        }
        .right{
            width: 236px;
            height: 60px;
            display: inline-block;
        }
       /* #date{
            position: absolute;
            top: 90px;
        }*/
        #lb{
            position: relative;
            top:20px;
        }
        #rb{
            position: relative;
            top:20px;
        }
        h4{
            margin-bottom: 10px;
        }
         #people{
             margin-top: 60px;
         }
        .font-size{
          size: 13px;
        }
        .select{
            width: 100px;
        }
        .people-div{
            float: left;
            margin-right: 30px;
        }
        #btn{
            margin-top: 20px;
            width: 225px;
            height: 35px;
            line-height: 35px;
            color: #fff;
            background: #e5014a;
            border-radius: 7px;
            text-align: center;
            font-size: 16px;
            font-weight: bolder;
            border: none;
        }
        .clear{
            clear: both;
        }

    </style>

</head>
<body>
<form id="flightquery" action="/MavenDemo/QueryFlight">
<div>
    <input type="radio" checked="checked">单程
    <input type="radio">往返
    常用航线:<select>
                <option></option>
                <option></option>
            </select>
</div>
<div class="left">
    <h4>出发城市</h4>
    <div>
        <div class="out">
            <div class="middle1"></div>
            <div class="midlle2">
                <input id="citycite" name="takeCity" class="inp" type="text">
                <div class="position"></div>
            </div>
        </div>
        <div></div>
    </div>
</div>
<div class="right">
    <h4>到达城市</h4>
    <div>
        <div class="out">
            <div class="middle12"></div>
            <div class="midlle2">
                <input id="citycite2" name="arriveCity" class="inp" type="text">
                <div class="position"></div>
            </div>
        </div>
        <div></div>
    </div>
</div>
<br>
<div class="left" id="lb">
    <h4>出发日期</h4>
    <div>
        <div class="out">
            <div id="datebtn" class="middle13"></div>
            <div class="midlle2">
                <input id="applytime" name="takeDate" class="inp" type="text">
                <div class="position"></div>
            </div>
        </div>
        <div></div>
    </div>
</div>
<div class="right" id="rb">
    <h4>返回日期</h4>
    <div>
        <div class="out">
            <div class="middle13"></div>
            <div class="midlle2">
                <input id="applytime2" class="inp" type="text">
                <div class="position"></div>
            </div>
        </div>
        <div></div>
    </div>
</div>
    <div class="clear"></div>
<div id="people">
    <div class="people-div">
        <span class="font-size">成人(>=12岁)</span><br>
        <select name="adultNum" class="select">
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
        </select>
    </div>
    <div class="people-div">
        <span class="font-size">儿童(2-11岁)</span><br>
        <select name="childNum" class="select">
            <option value="0">0</option>
            <option value="1">1</option>
            <option value="2">2</option>
        </select>
    </div>
    <div class="people-div">
        <span class="font-size">婴儿(<2岁)</span><br>
        <select name="babyNum" class="select">
            <option value="0">0</option>
            <option value="1">1</option>
            <option value="2">2</option>
        </select>
    </div>
</div>
    <div class="clear"></div>
<div>
    <input id="btn" type="submit" value="立即查询">
</div>
</form>
<script type="text/javascript" src="js/layDate-v5.0.9/laydate/laydate.js"></script>
<script type="text/javascript" src="js/1683/cityselect.js"></script>
<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
    laydate.render({
        elem: '#applytime',
        min:0
    });
    laydate.render({
        elem: '#applytime2',
        min:0
    });
    var test=new Vcity.CitySelector({input:'citycite'});
    var test2=new Vcity.CitySelector({input:'citycite2'});

</script>
</body>
</html>