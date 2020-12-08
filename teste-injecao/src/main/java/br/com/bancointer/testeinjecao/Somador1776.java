package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1776")
public class Somador1776 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
