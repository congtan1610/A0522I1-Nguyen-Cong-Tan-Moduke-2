package bai_tap_them2.repository;

import bai_tap_them2.model.PhuongTien;

import java.util.ArrayList;

public class VehicleRepositoryImpl implements VehicleRepository {
    private ArrayList<PhuongTien.Oto> otoList = new ArrayList<>();
    private ArrayList<PhuongTien.XeTai> xeTaiList = new ArrayList<>();
    private ArrayList<PhuongTien.XeMay> xeMayList = new ArrayList<>();
    private ArrayList<PhuongTien.HangSX> hangSanXuat=new ArrayList<>();
    {
        hangSanXuat.add(new PhuongTien.HangSX("A01","Toyota","Japan"));
        hangSanXuat.add(new PhuongTien.HangSX("A02","Toyota","Japan"));
        hangSanXuat.add(new PhuongTien.HangSX("A03","Toyota","Japan"));
    }

    @Override
    public void add(int choose) {

    }

    @Override
    public void findAll() {

    }

    @Override
    public void remove() {

    }

    @Override
    public void findById() {

    }
}
