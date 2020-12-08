package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador995")
public class Somador995 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
