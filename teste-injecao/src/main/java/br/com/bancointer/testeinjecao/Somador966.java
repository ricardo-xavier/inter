package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador966")
public class Somador966 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
