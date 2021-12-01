# 1922 疫苗預約系統

- 疫苗 (`Vaccine`): 
	- `AZ`
	- `BNT`
	- `MODERNA` (莫德納)
	-  `MVC` (高端)

## Table

- 居民 (Resident)
	- nhiNo
	- phoneNo
	- chooses
	- cancels
- 選擇疫苗 (Choose)
	- choose_time
	- vaccine
- 取消疫苗 (Cancel)
	- cancel_time
	- vaccine

Table 關係:

```
居民 ←1:*→ 選擇疫苗
居民 ←1:*→ 取消疫苗
```

## 虛擬 UI

健保卡號碼: [          ] (必填, 不可變更)

手機號碼: [          ] (必填, 可修改)

選擇疫苗:

- [X] AZ
- [X] BNT
- [ ] 莫德納
- [ ] 高端

# CRUD 風格 API

- 新增居民
  - insert 居民
  - loop 選擇疫苗
    - insert 選擇疫苗
- 更新居民資料
  - find 居民
  - if 手機 modified, update 居民
  - loop 選擇疫苗
    - if exist in both UI and DB; do nothing
    - if exist only in UI; insert 疫苗選擇
    - if exist only in DB; delete 疫苗選擇
- 取得居民資料

# 命令風格 API

- 預約
    - insert 居民 table
    - loop 選擇疫苗
        - insert 選擇疫苗
- 更新居民資訊
    - update 居民
- 加選疫苗
    - insert 疫苗選擇
- 取消疫苗
    - delete 疫苗選擇
    - insert 取消疫苗
- 取得預約結果

# Homework

- 增加邏輯驗證: 每人最多選2種
- 增加換選疫苗 API
    - delete 疫苗選擇
    - insert 取消疫苗
    - insert 疫苗選擇
