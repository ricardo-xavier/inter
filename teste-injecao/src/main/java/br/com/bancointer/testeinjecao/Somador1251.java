package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1251")
public class Somador1251 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
