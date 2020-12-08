package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador187")
public class Somador187 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
